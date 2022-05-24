package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.bo.AdminBO;
import com.learning.dto.User;

public class AdminUserController extends HttpServlet{
	private static final long serialVersionUID=1L;
	public AdminUserController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		AdminBO adminbo = new AdminBO();
		RequestDispatcher dispatcher = null;
		try{
			List<User> userList = adminbo.getAllusers();
			request.setAttribute("clist", userList);
			System.out.println(userList.size());
			dispatcher = request.getRequestDispatcher("UserDetails.jsp");
			dispatcher.forward(request, response);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
