package io.kiran.dto;

public class Topic {

	private int id;
	private String courseName;
	private String department;
	
	public Topic(){}
	
	
	
	public Topic(int id, String courseName, String department) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
