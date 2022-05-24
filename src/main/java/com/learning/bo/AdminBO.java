package com.learning.bo;

import java.sql.SQLException;
import java.util.List;

import com.learning.dto.User;

public class AdminBO {
	public List<User> getAllusers() throws ClassNotFoundException, SQLException {
		AdminDAO admindao = new AdminDAO();
		return admindao.getAllUsers();
	}

	public List<User> getAllVendors() throws ClassNotFoundException, SQLException {
		AdminDAO admindao = new AdminDAo();
		return admindao.getAllVendors();
	}
}
