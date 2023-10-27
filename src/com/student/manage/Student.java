package com.student.manage;

public class Student {
    private int student_id;
	private String name;
	private String phone;
	private String city;
	
	public Student(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public Student(int student_id, String name, String phone, String city) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public Student() {
		super();
		
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
	
	
}
