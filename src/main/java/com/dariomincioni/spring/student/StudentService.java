package com.dariomincioni.spring.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void createStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> readStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(e -> {students.add(e);});
		return students; 
	}
	
	public Optional<Student> readStudent(int id) {
		return studentRepository.findById(id);
	}
	
	public String updateStudent(int id, Student student) {
		if (studentRepository.existsById(id)){
			studentRepository.save(student);
			return "Success";
		}
		else {
			return "No such element";
		}
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
}
