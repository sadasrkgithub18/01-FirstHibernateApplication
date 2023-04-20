package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;
import com.ait.entity.Student;

public class Tester {

	public static void main(String[] args) {
		
		StudentDAO  dao = new StudentDAOImpl();
		
		/*
		 * creating Student object
		 */
		
		Student student = new Student();
		student.setSid(11011);
		student.setSname("RAHUL");
		student.setGender("Male");
		student.setMarks(600);
		dao.saveStudent(student);
	
		
		
		/*
		Student stud = dao.loadStudent(11012);
		System.out.println(stud);
		*/
		
		/*
		Student s = dao.updateStudent(11011, 799);
		System.out.println(s);
		*/
		
		 // dao.deleteStudent(22022);
		
		
		
	}

}



