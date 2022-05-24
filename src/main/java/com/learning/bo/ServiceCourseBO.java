package com.learning.bo;

import java.sql.SQLException;
import java.util.List;

import com.learning.dto.ServiceCourse;

public class ServiceCourseBO {
	public boolean update(ServiceCourse serviceCourse) throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.update(serviceCourse);

	}

	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.delete(id);
	}

	public ServiceCourse getServiceCourse(ServiceCourse serviceCourse) throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.getServiceCourse(serviceCourse);

	}

	public List<ServiceCourse> getServiceCourses() throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.getServiceCourses();

	}

	public boolean add(ServiceCourse serviceCourse) throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.add(serviceCourse);

	}

	public boolean deleteAll() throws ClassNotFoundException, SQLException {
		ServiceCourseDAO serviceCoursedao = new ServiceCourseDAO();
		return serviceCoursedao.deleteAll();
	}
}
