package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.learning.dto.Address;
import com.learning.dto.Role;
import com.learning.dto.User;
import com.learning.util.DBConnection;
import com.mysql.cj.protocol.Resultset;

public class UserDAO {
	public User getUser(int id) throws ClassNotFoundException, SQLException{
		Connection conn = DBConnection.getConnection();
		User User = new User();
		Role role = new Role();
		try {
			PreparedStatement ps = conn.prepareStatement("Select USER_ID, NAME, AGE, GENDER, CONTACT_NUMBER, EMAIL, PASSWORD, ROLE_ID from USER_TABLE WHERE User_Id = ?");
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				User.setName(rs.getString(2));
				User.setAge(rs.getInt(3));
				User.setGender(rs.getString(4));
				User.setContactNumber(5);
				User.setEmail(rs.getString(6));
				User.setPassword(rs.getString(7));
				User.setId(rs.getInt(8));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return User;
	}
	public List<User> getAllUsers() throws ClassNotFoundException, SQLException{
		Connection conn = DBConnection.getConnection();
		List<User> userList = new ArrayList<>();
		User User = new User();
		Role role = new Role();
		try {
			PreparedStatement ps = conn.prepareStatement("Select USER_ID, NAME, AGE, GENDER, CONTACT_NUMBER, EMAIL, PASSWORD, ROLE_ID from USER_TABLE");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User.setName(rs.getString(2));
				User.setAge(rs.getInt(3));
				User.setGender(rs.getString(4));
				User.setContactNumber(5);
				User.setEmail(rs.getString(6));
				User.setPassword(rs.getString(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public boolean add(User user, Address address) throws ClassNotFoundException, SQLException{
		System.out.println("dao"+user.getName()+user)
	}
}
