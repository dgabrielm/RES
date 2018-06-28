/**
 * @author Dario Mincioni
 * 
 * Database access
 */

package com.dariomincioni.spring.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	//implements crud repository which has many features already implemented
	// service class creates a dependency object of this interface to access
	// the in memory database. Apache Derby dataase is in the classpath so
	// that embedded database is used. Spring takes care of everything!
	
}
