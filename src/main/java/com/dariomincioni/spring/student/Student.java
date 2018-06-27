/**
 * @author Dario Mincioni
 * 
 * A simple model class representing student data for REST API example
 */
package com.dariomincioni.spring.student;

public class Student {

	private int id;
	private String name;
	private String courseTitle;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String courseTitle) {
		super();
		this.id = id;
		this.name = name;
		this.courseTitle = courseTitle;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
}
