package conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	private static Vector<Connection> pool = new Vector<>();

	// singletone pattern
	private static ConnectionPool instance = new ConnectionPool();

	public static ConnectionPool getInstance() {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	private ConnectionPool() {
		try {
			initPool();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private synchronized void initPool() throws SQLException {
		destroyPool();
		ConnectionFactory factory = ConnectionFactory.getInstance();

		for (int i = 0; i < factory.getMaxConn(); i++) {
			pool.add(factory.getConnection());
		}
	}

	private synchronized void destroyPool() throws SQLException {
		for (Connection conn : pool) {
			conn.close();
		}
		pool.clear();
	}
	
	//커넥션 가져오기
	public synchronized Connection getConnection() throws InterruptedException{
		while(pool.size() ==0) {
			wait();
		}
		
		Connection conn = pool.remove(pool.size() -1 );
		
		return conn;
	}
	
	public synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
		System.out.println("pool size : " + pool.size());
		notifyAll();
	}
}