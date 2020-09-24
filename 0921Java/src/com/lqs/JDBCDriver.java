package com.lqs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBCDriver {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("드라이버 로딩 성공~!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/jdbc_ex?serverTimezone=UTC&useSSL=false&characterEncoding=UTF-8&useUnicode=true";
		String user = "root";
		String password = "admin";

		String query = "";
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("id : ");
			String id = reader.readLine();
			
			System.out.println("pwd : ");
			String pwd = reader.readLine();

			System.out.println("name : ");
			String name = reader.readLine();
			
			System.out.println("phone : ");
			String phone = reader.readLine();
			
			System.out.println("email : ");
			String email = reader.readLine();
			
			query="INSERT INTO TB_MEMBER(MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, MEM_EMAIL) VALUES(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);
			
			int updCnt=pstmt.executeUpdate();
			
			System.out.println(updCnt + "개의 행이 등록되었습니다.");
			
			query = "SELECT MEM_SEQ_NO, MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, MEM_EMAIL FROM TB_MEMBER ORDER BY MEM_SEQ_NO DESC";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int memSeqNo = rs.getInt(1);				//번호로 가져오는 방법
				String memId = rs.getNString("MEM_ID");		//컬럼 이름으로 가져오는 방법
				String memPwd = rs.getNString("MEM_PWD");
				String memName = rs.getNString("MEM_NAME");
				String memPhone = rs.getNString("MEM_PHONE");
				String memEmail = rs.getNString("MEM_EMAIL");
	
				System.out.printf("%d\t %s\t %s\t %s\t %s\t %s\n", memSeqNo, memId, memPwd, memName, memPhone, memEmail);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
			if(rs!=null) rs.close();
			if(stmt!= null) stmt.close();
			if(pstmt!= null) pstmt.close();
			if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
