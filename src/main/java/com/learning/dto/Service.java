package com.learning.dto;

public class Service {
	String name;
	int id;
	long duration;
	double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Service() {
		super();
	}

	public Service(String name, int id, long duration, double amount) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.amount = amount;
	}
}
