/////////    /////////   /////////   /////////  
///   ///    /////////   /////////   /////////
///   ///    ///         ///        	///	 
/////////    /////////   ////////  		///
///   ///    /////////   ////////  		///	 
///   ///    ///              ///   	///	
///    ///   /////////   ////////   	///	
///    ///   /////////  ////////    	///	


   //////     /////////   /////////
 ///   ///	  /////////   /////////
///    ///    ///   ///      ///
///     ///   ///   ///      ///
///////////   /////////      ///
///    ///    ///            ///
///    ///    ///         /////////
///    ///    ///         /////////


-- Version 1 --

Author: Dario Mincioni
Email: dario.mincioni@gmail.com

This is a fully-working RESTful API using Spring Boot. 
I have only added a Student resource as an example: /students

Operations:

GET /students
GET /students/id
POST /students(JSON)
PUT /students/id(JSON)
DELETE /students/id

(for more depth, see the swagger documenatation)

The most notable libraries used in the application include:
	- Apache TOMCAT embedded server
	- Apache Derby embedded in-memory-database
	- Jackson JSON conversion library
	- Spring web/jpa

Live ver: www.dariomincioni.com:5041/students
Project : www.dariomincioni.com/projects/REST-API.html COMING SOON
Javadoc : www.dariomincioni.com:5041
Swagger : www.dariomincioni.com:5041/swagger-ui.html
Actuator: www.dariomincioni.com:5041/actuator

I created this API by following the excellent guide provided by Koushik Kothagal
applying fixes where necessary due to changes in technology versions and writing
methods to suite my own purposes. This can be found at: 
https://javabrains.thinkific.com/courses/springboot-quickstart