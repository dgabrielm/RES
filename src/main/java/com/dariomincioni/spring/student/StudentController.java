package com.dariomincioni.spring.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/students")
	public List<Student> getStudents() {
		return studentService.readStudents();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/example")
	public Student getExample() {
		return new Student(9999, "Dario", "Computer Science");
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/students/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return studentService.readStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
	

}
