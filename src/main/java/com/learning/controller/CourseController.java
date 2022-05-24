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
import com.learning.bo.UserBO;
import com.learning.dto.Course;
import com.learning.dto.User;

public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CourseController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String vendorid[] = request.getParameterValues("vendorid");
		String courseid[] = request.getParameterValues("choose");
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		int uid = u.getId();
		for (int i = 0; i < courseid.length; i++) {
			System.out.println(courseid[i]);
		}
		RequestDispatcher dispatcher = null;
		UserBO userbo = new UserBO();
		boolean status = userbo.addAvailCourse(courseid, uid);
		dispatcher = request.getRequestDispatcher("UserHome.jsp");
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Course> result = null;
		CourseBO coursebo = new CourseBO();

		RequestDispatcher dispatcher = null;
		HttpSession session = request.getSession();

		try {
			result = coursebo.getCourses();
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dispatcher = request.getRequestDispatcher("CourseList.jsp");

		request.setAttribute("courseList", result);
		// session.setAttribute("username", uname);
		dispatcher.forward(request, response);

	}
}
