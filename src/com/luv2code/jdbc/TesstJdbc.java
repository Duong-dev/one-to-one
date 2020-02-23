package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesstJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
			String user = "hbstudent";
			String password = "hbstudent";

			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Yeah!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
