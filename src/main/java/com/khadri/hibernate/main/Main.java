package com.khadri.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.util.StandardRegistryUtil;
import com.khadri.jee.hibernate.entities.Student;
import com.khadri.jee.hibernate.entities.Student2;

public class Main {

	public static void main(String[] args) {
		
		Session session = StandardRegistryUtil.createSession(Student.class,Student2.class);
	
		Transaction beginTransaction = session.beginTransaction();
		
		Student student = new Student();
		session.save(student);
		
		beginTransaction.commit();
	}
}
