package com.learning.bo;

import java.sql.SQLException;

public class VendorBO {
	public boolean delete(String uname,String upwd) throws ClassNotFoundException, SQLException {
		VendorDAO vendao = new VendorDAO();
		return vendao.delete(uname, upwd);
	}
}
