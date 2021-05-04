package HTA0504;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static HTA0504.ConnectionUtils.getConnection;

public class UserDao {
	
	//insertUser
	public void insertUser(User user) {
		String sql = "insert into sample_users "
				   + "(user_id, user_name, user_password, user_email, user_phone) "
				   + "values "
				   + "(?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		}finally {
			try {if(con != null) con.close();}catch(SQLException e){}
			try {if(pstmt != null) pstmt.close();}catch(SQLException e) {}
		}
	}
	
	//getUserById
	public User getUserById(String id) {
		String sql = "select user_id, user_name, user_password, user_email, user_phone, user_status, user_create_date "
				   + "from sample_users "
				   + "where user_id = ?";
		User user = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getString("user_id"));
				user.setName(rs.getString("user_name"));
				user.setPassword(rs.getString("user_password"));
				user.setEmail(rs.getString("user_email"));
				user.setPhone(rs.getString("user_phone"));
				user.setStatus(rs.getString("user_status"));
				user.setCreatedDate(rs.getDate("user_create_date"));
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			try {if(con!=null) con.close();}catch(SQLException e) {}
			try {if(pstmt!=null) pstmt.close();}catch(SQLException e) {}
			try {if(rs!=null) rs.close();}catch(SQLException e) {}
		}
		return user;
	}
	
	// getAllUsers
	public List<User> getAllUsers(){
		String sql = "select user_id, user_name, user_password, user_email, user_phone, user_status, user_create_date "
				   + "from sample_users ";
		
		List<User> users = new ArrayList<User>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getString("user_id"));
				user.setName(rs.getString("user_name"));
				user.setPassword(rs.getString("user_password"));
				user.setEmail(rs.getString("user_email"));
				user.setPhone(rs.getString("user_phone"));
				user.setStatus(rs.getString("user_status"));
				user.setCreatedDate(rs.getDate("user_create_date"));
				users.add(user);
			}
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally {
			try {if(con!=null) con.close();} catch(SQLException e) {}
			try {if(pstmt!=null) pstmt.close();} catch(SQLException e) {}
			try {if(rs!=null) rs.close();} catch(SQLException e) {}
		}
		return users;
	}
	
	//updateUser
	public void updateUser(User user) {
		String sql = "update sample_book "
				   + "set "
				   + "user_password = ? "
				   + "user_email = ? "
				   + "user_phone = ? "
				   + "user_status = ?"
				   + "where user_id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getStatus());
			pstmt.setString(5, user.getId());
			pstmt.executeUpdate();			
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			try {if(con!=null)con.close();}catch(SQLException e) {}
			try {if(pstmt!=null)pstmt.close();}catch(SQLException e) {}
		}
	}
	
	//deleteUser
	public void DeleteUser(String userId) {
		String sql = "delete from sample_books "
				   + "where user_id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
				
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			try {if(con!=null) con.close();}catch(SQLException e) {}
			try {if(pstmt!=null) pstmt.close();}catch(SQLException e) {}
		}
	}
	
}
