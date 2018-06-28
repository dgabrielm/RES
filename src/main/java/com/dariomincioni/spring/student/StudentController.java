/**
 * @author Dario Mincioni
 * 
 * Controller / Event Handler 
 */

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
	
	// Dependency injection. This program requires access to a database which we
	// want one instance of. This annotation injects the instance created at runtime
	@Autowired
	private StudentService studentService;
	
	// Spring MVC handles the HTTP protocol
	
	/**
	 * 
	 * Takes JSON input from client and converts to POJO using Jackson library
	 * @throws internal server error if any Student values are null or if id number
	 * (inside JSON input) is not between 1 - 100 or already taken
	 * @param student - Student object to put in the database
	 * @return system message of success/failure
	 */
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public String createStudentWrapper(@RequestBody Student student) {
			return studentService.createStudent(student);
	}
	
	/**
	 *
	 * @return - list of students currently in the database instance
	 */
	@RequestMapping(method=RequestMethod.GET, value="/students")
	public List<Student> readStudentsWrapper() {
		return studentService.readStudents();
	}
	
	/**
	 * provides hard-coded example data for convenience
	 * 
	 * @return - Student object with values
	 * 100, "Dario", "Computer Science"
	 */
	@RequestMapping(method=RequestMethod.GET, value="/example")
	public Student getExample() {
		return new Student(100, "Dario", "Computer Science");
	}
	
	/**
	 * 
	 * @requires id exists in database
	 * @param id - id of desired student 
	 * @return Student object with desired id (converted to JSON)
	 */
	@RequestMapping(method=RequestMethod.GET, value="/students/{id}")
	public Optional<Student> readStudentWrapper(@PathVariable int id) {
		return studentService.readStudent(id);
	}
	
	/**
	 * 
	 * @param id - id of student you wish to update
	 * @param student - updated version of student
	 * @return - message which displays success/failure of operation
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public String updateStudentWrapper(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	/**
	 * 
	 * @param id - id of student entry to be deleted
	 * @return success message if id exists in the students database
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public String deleteStudentWrapper(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}

}
