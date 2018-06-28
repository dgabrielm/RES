/**
 * @author Dario Mincioni
 * 
 * Model (?)
 */
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
	
	/**
	 * Wrapped by method StudentController.createStudentWrapper()
	 */
	public String createStudent(Student student) {
		if (studentRepository.existsById(student.getId())) {
			return "A Student with that id already exists. Only id numbers 1-100 are available";
		} else {
			studentRepository.save(student);
			return "Successful creation";
		}
	}
	
	/**
	 * Wrapped by method StudentController.readStudentsWrapper()
	 */
	public List<Student> readStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(e -> {students.add(e);});
		return students; 
	}
	
	/**
	 * Wrapped by method StudentController.readStudentWrapper()
	 */
	public Optional<Student> readStudent(int id) {
		return studentRepository.findById(id);
	}
	
	/**
	 * Wrapped by method StudentController.updateStudentsWrapper()
	 */
	public String updateStudent(int id, Student student) {
		if (studentRepository.existsById(id)){
			if (student.getId() != id) {
				return "You may not update the id of a student. To achieve effect; this please"
						+ "delete the student entry and then create it again with a new id";
			} else {
				studentRepository.save(student);
				return "Success";
			}
		}
		else {
			return "No such element";
		}
	}
	
	/**
	 * Wrapped by method StudentController.deleteStudentsWrapper()
	 */
	public String deleteStudent(int id) {
		if (studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return "successful deletion";
		} else {
			return "no entry exists with that id";
		}
		
	}
	
}
