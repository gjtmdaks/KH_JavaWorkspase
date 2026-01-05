package com.kh.hw.person.model.vo;

public class Employee extends Person {
	private int salsry;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double height, double weight, int salsry, String dept) {
		super(name, age, height, weight);
		this.salsry = salsry;
		this.dept = dept;
	}

	public int getSalsry() {
		return salsry;
	}

	public void setSalsry(int salsry) {
		this.salsry = salsry;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+", salsry=" + salsry + ", dept=" + dept;
	}
	
	
}
