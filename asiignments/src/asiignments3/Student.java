package asiignments3;

public class Student {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll, String name, int marks){
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks);
	}
	
	public static void main(String[] args) {
		//Student 1
		Student s1 = new Student();
		s1.roll = 111;
		s1.name = "Ratan";
		s1.marks = 99;
		
		s1.displayStudentDetails(s1.roll,s1.name,s1.marks);
		
		System.out.println("===============");
		
		//Student 2
		Student s2 = new Student();
		s2.roll = 101;
		s2.name = "Rajasekar";
		s2.marks = 95;
		
		s2.displayStudentDetails(s2.roll,s2.name,s2.marks);
		
		s1 = null;
		s2 = null;

	}
}
