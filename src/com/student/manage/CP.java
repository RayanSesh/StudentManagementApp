package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    static Connection con;
	public static Connection createC() {
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection....
			String user = "root";
			String password = "415m4x1r3";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			try {
				con = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
