package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.bo.AdminBO;
import com.learning.dto.User;

public class AdminVendorController {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public AdminVendorController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminBO adminbo = new AdminBO();
		RequestDispatcher dispatcher = null;
		try {
			List<User> vendorList = adminbo.getAllVendors();
			request.setAttribute("clist", vendorList);
			System.out.println(vendorList.size());
			dispatcher = request.getRequestDispatcher("VendorDetails.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
