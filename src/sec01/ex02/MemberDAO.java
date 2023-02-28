package sec01.ex02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	private static final String driver = "oracle.jdbc.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "ezen";
	private static final String pwd = "12345";
	
	//private Statement stmt;
	private PreparedStatement pstmt;
	private Connection con;
	
	public List<MemberVO> ListMembers(){
		
		List<MemberVO> list = new ArrayList<>();
		try {
			connDB();
			String query = "select * from t_member";
			System.out.println("prepareStatement : " +query);
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			while (rs.next())
			{
				String id =rs.getString("id");
				String pwd =rs.getString("pwd");
				String name =rs.getString("name");
				String email =rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle ����̹� �ε� ����");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
