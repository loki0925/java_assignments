package que1;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println("Roll Number: " + roll);	
		System.out.println("Student Name: " + name);
		System.out.println("Student Marks: " + marks);
		System.out.println("Student Grade: " + calculateGrade());
	}
	private char calculateGrade() {
		if (marks >= 500) {
			grade = 'A';
		}
		else if (marks < 500 && marks >= 400) {
			grade = 'B';
		}
		else {
			grade = 'C';
		}
		return grade;
	}

	@Override
	public String toString() {
		return "Roll Number: " + this.roll + "\nStudent Name: " + this.name + "\nStudent Marks: " + this.marks + "\nStudent Grade: " + calculateGrade();
	}
}
