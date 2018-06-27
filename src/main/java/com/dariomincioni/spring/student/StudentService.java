package com.dariomincioni.spring.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Student> students = new ArrayList<>();
	
	
	public List<Student> getStudents() {
		students.add(new Student(1, "Dario", "Computer Science"));
		students.add(new Student(2, "Samantha", "English Studies"));
		students.add(new Student(3, "Luke", "History"));
		return students; 
	}
	
}
