package com.learning.dto;

public class ServiceCourse {
	Service serviceId;
	Course courseId;

	public Service getServiceId() {
		return serviceId;
	}

	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public ServiceCourse() {
		super();
	}

	public ServiceCourse(Service serviceId, Course courseId) {
		super();
		this.serviceId = serviceId;
		this.courseId = courseId;
	}
}
