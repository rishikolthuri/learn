package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.bo.VendorBO;

public class VendorDeactivateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VendorDeactivateController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean result = false;
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		VendorBO venbo = new VendorBO();
		try {
			result = venbo.delete(uname, upwd);
			RequestDispatcher dispatcher = null;
			HttpSession session = request.getSession();
			System.out.println(result);
			if (result) {
				dispatcher = request.getRequestDispatcher("homepage.jsp");
				session.setAttribute("username", uname);
				dispatcher.forward(request, response);

			} else {
				dispatcher = request.getRequestDispatcher("Login.jsp");
				request.setAttribute("msg", "Invalid username/password");
				dispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
