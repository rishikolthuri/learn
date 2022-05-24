package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.bo.CourseBO;
import com.learning.dto.Course;
import com.learning.dto.User;

public class VendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VendorController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean result = false;
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		Course course = new Course();
		CourseBO coursebo = new CourseBO();
		course.setCid(cid);
		course.setCname(cname);
		RequestDispatcher dispatcher = null;
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		try {
			result = coursebo.add(course, u.getId());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result) {
			dispatcher = request.getRequestDispatcher("Success.jsp");
			// session.setAttribute("username", uname);
			dispatcher.forward(request, response);

		} else {
			dispatcher = request.getRequestDispatcher("VendorHome.jsp");
			// request.setAttribute("msg","Invalid username/password");
			dispatcher.forward(request, response);
		}
	}
}
