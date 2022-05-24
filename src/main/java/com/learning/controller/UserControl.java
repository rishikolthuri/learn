package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.bo.AddressBO;
import com.learning.dto.Address;
import com.learning.dto.User;

public class UserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("Register")) {
			registrationProcess(request, response);
		}
		if (action.equals("login")) {
			try {
				processLogin(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	private void registrationProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("uage"));
		long contact = Long.parseLong(request.getParameter("ucont"));
		String gender = request.getParameter("ugen");
		String add1 = request.getParameter("address1");
		String add2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		long pincode = Long.parseLong(request.getParameter("pincode"));
		String email = request.getParameter("email");
		String pass = request.getParameter("upwd");
		String role = request.getParameter("utype");

		User user = new User();
		Address address = new Address();
		user.setName(name);
		user.setAge(age);
		user.setGender(gender);
		user.setEmail(email);
		user.setContactNumber(contact);
		user.setPassword(pass);
		int id = 0;
		if (role.equalsIgnoreCase("admin")) {
			id = 1;
			user.setRoleId(id);
		} else if (role.equalsIgnoreCase("vendor")) {
			id = 2;
			user.setRoleId(id);
		} else if (role.equalsIgnoreCase("learner")) {
			id = 3;
			user.setRoleId(id);
		}
		address.setLine1(add1);
		address.setLine2(add2);
		address.setCity(city);
		address.setCountry(country);
		address.setPincode(pincode);
		address.setState(state);

		AddressBo addressBO = new AddressBO();
		UserBO userBO = new UserBO();
		RequestDispatcher dispatcher = null;
		boolean b;

		try {
			b = userBO.add(user, address);
			if (b) {
				dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private void processLogin(HttpServletRequest request, HttpServletResponse response) {
		String u = request.getParameter("role");
		User user = null;
		boolean result = false;
		HttpSession session = request.getSession();
		try {
			if (u.equalsIgnoreCase("admin")) {
				String name = request.getParameter("uname");
				String upwd = request.getParameter("upwd");
				UserBO userbo = new UserBO();
				user = userbo.validateUser(uname, upwd);
				RequestDispatcher dispatcher = null;

				if (user != null) {
					dispatcher = request.getRequestDispatcher("AdminHome.jsp");
					session.setAttribute("user", user);
					dispatcher.forward(request, response);
				} else {
					dispatcher = request.getRequestDispatcher("login.jsp");
					request.setAttribute("msg", "Invalid Username/Password");
					dispatcher.forward(request, response);
				}
			} else if (u.equalsIgnoreCase("vendor")) {
				String uname = request.getParameter("uname");
				UserBO userbo = new UserBO();
				user = userbo.validateUser(uname, upwd);
				RequestDispatcher dispatcher = null;
				if (user != null) {
					dispatcher = request.getRequestDispatcher("VendorHome.jsp");
					session.setAttribute("user", user);
					dispatcher.forward(request, response);

				} else {
					dispatcher = request.getRequestDispatcher("homepage.jsp");
					dispatcher.forward(request, response);
				}
			} else if (u.equalsIgnoreCase("subscriber")) {
				String uname = request.getParameter("uname");
				String upwd = request.getParameter("upwd");
				UserBO userbo = new UserBO();
				user = userbo.validateUser(uname, upwd);
				RequestDispatcher dispatcher = null;
				session = request.getSession();
				if (user != null) {
					dispatcher = request.getRequestDispatcher("UserHome.jsp");
					session.setAttribute("user", user);
					dispatcher.forward(request, response);

				} else {
					dispatcher = request.getRequestDispatcher("homepage.jsp");
					request.setAttribute("msg", "Invalid username/password");
					dispatcher.forward(request, response);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
