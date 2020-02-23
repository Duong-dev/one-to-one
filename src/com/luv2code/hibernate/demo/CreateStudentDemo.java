package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();

		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// create a student object
			Student tempStudent = new Student("Ku", "Le", "kule@gmail.com");
			Student tempStudent2 = new Student("As", "Gy", "Asgy@gmail.com");
			Student tempStudent3 = new Student("Fu", "Ya", "fuya@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			session.save(tempStudent);
			session.save(tempStudent2);
			session.save(tempStudent3);


			// commit transaction
			session.getTransaction().commit();


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
