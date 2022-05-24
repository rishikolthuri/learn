package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.bo.CourseBO;
import com.learning.dto.Course;
import com.learning.dto.User;

public class VendorProvideController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VendorProvideController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		int uid = u.getId();
		CourseBO coursebo = new CourseBO();
		RequestDispatcher dispatcher = null;
		try {
			List<Course> courseList = coursebo.getProvideCourse(uid);
			request.setAttribute("clist", courseList);
			dispatcher = request.getRequestDispatcher("VProvideDisplay.jsp");

			dispatcher.forward(request, response);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
