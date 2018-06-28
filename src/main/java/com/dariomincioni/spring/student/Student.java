/**
 * @author Dario Mincioni
 * 
 * A simple model class representing student data for REST API example
 */
package com.dariomincioni.spring.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

// persistence library annotation to treat this class as a database entry
@Entity
public class Student {

	// persistence library annotation to treat this field as the primary key
	@Id
	// @NotNull ensures we get some input. More validation is possible but depends
	// on desired result. As this is example data I only wish to enforce not null
	// and limit available id numbers in case of malicious users
	@NotNull
	@Min(value = 1) 
	@Max(value = 100)
	private int id;
	@NotNull
	private String name;
	@NotNull
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
	
	// very standard data which is not worth documenting with javadoc
	
}
