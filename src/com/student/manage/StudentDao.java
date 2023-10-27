package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

    // Inserting student record
    public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
			
			//jdbc code....
			Connection con = CP.createC();
			String q = "Insert into students (name, phone, city) values(?,?,?)";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getPhone());
			pstmt.setString(3, st.getCity());
			
			//execute
			pstmt.executeUpdate();
			f = true;
		}catch (Exception e) {
		//to handle exception
		e.printStackTrace();
		}
		return f;

	}

    // Deleting a student record

    public static boolean deleteStudent(int userId) {
		
		boolean f = false;
		try {
			
			//jdbc code....
			Connection con = CP.createC();
			String q = "DELETE FROM students WHERE student_id = ?";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);
			
			//execute
			pstmt.executeUpdate();
			f = true;
		}catch (Exception e) {
		//to handle exception
		e.printStackTrace();
		}
		return f;
		
		
	}
    // Display student records
    public static void showAllstudents() {
		
		
		try {
			
			//jdbc code....
			Connection con = CP.createC();
			String q = "SELECT * FROM students;";
			PreparedStatement pstmt = con.prepareStatement(q);
			//Statement stmt = (Statement) con.createStatement();
			//execute
			ResultSet set = pstmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("city");
				
				System.out.println("ID :" + id);
				System.out.println("Name :" + name);
				System.out.println("Phone # :" + phone);
				System.out.println("City :" + city);
				
				System.out.println("+++++++++++++++++++++++++");
			}
			
		}catch (Exception e) {
		//to handle exception
		e.printStackTrace();
		}		

	}

    
}
