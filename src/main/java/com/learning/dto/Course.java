package com.learning.dto;

public class Course {
	String cname;
	int cid;
	int userid;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Course() {
		super();
	}

	public Course(String cname, int cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
}
