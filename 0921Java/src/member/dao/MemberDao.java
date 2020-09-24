package member.dao;

import java.sql.*;
import java.util.ArrayList;

import member.model.Member;

public class MemberDao {
	//싱글톤 패턴
	private MemberDao() {}
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	
	public ArrayList<Member> selectMemberList(Connection conn) throws SQLException {
		String query = "SELECT MEM_SEQ_NO, MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, MEM_EMAIL FROM TB_MEMBER ORDER BY MEM_SEQ_NO DESC";
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		while(rs.next()) {
			Member member = new Member();
			
			member.setMem_seq_no(rs.getInt("mem_seq_no"));
			member.setMem_id(rs.getString("mem_id"));
			member.setMem_pwd(rs.getString("mem_pwd"));
			member.setMem_name(rs.getString("mem_name"));
			member.setMem_phone(rs.getString("mem_phone"));
			member.setMem_email(rs.getString("mem_email"));
			
			memberList.add(member);
		}
		return memberList;
	}
	
	public int insertMember(Connection conn, Member member) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO TB_MEMBER (");
		query.append(" MEM_ID ");
		query.append(" ,MEM_PWD ");
		query.append(" ,MEM_NAME ");
		query.append(" ,MEM_PHONE ");
		query.append(" , MEM_EMAIL ");
		query.append(" ) VALUES ( ");
		query.append(" ? ");
		query.append(" ,? ");
		query.append(" ,? ");
		query.append(" ,? ");
		query.append(" ,? ");
		query.append(" )");
		
		PreparedStatement pstmt = conn.prepareStatement(query.toString());
		
		int i=1;
		pstmt.setString(i++, member.getMem_id());
		pstmt.setString(i++, member.getMem_pwd());
		pstmt.setString(i++, member.getMem_name());
		pstmt.setString(i++, member.getMem_phone());
		pstmt.setString(i++, member.getMem_email());

		int updCnt = pstmt.executeUpdate();
		return updCnt;
		
	}
}
