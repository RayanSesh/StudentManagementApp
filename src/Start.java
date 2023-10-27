import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display students");
			System.out.println("Press 4 to Exit App");
			int c = Integer.parseInt(br.readLine());
			
			if (c == 1) {
				// add student
				System.out.println("Enter student name : ");
				String name = br.readLine();
				
				System.out.println("Enter student phone# : ");
				String phone = br.readLine();
				
				System.out.println("Enter student city : ");
				String city = br.readLine();
				
				//Create student object store student 
				Student st = new Student(name,phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student successfully added");
				}else {
					System.out.println("Something went wrong. Try again");
				}
				System.out.println(st);
			}else if(c == 2) {
				// delete student
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Student record successfully deleted");
				}else {
					System.out.println("Something went wrong. Try again");
				}
				
			}else if(c == 3) {
				// display students
				StudentDao.showAllstudents();
			}else if(c == 4) {
				// exit
				break;
			}else {
				
			}
			
		}
		System.out.println("Thank you for using my application");
		System.out.println("See you soon");
	}

}
