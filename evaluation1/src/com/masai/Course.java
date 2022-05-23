package com.masai;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	
	void displayCourseDetails(){
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username == "Admin" && password =="1234") {
			Course c1 = new Course();
			c1.courseId = 15;
			c1.courseName = "masai";
			c1.courseFee = 00;
			
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");        
		}
	}
    public static void main(String[] args) {
    	authenticate( "Admin","1234");
    	authenticate("adminn","3333");
    }
}
