package assignment4;

public class AccessStudentData {

public static void main(String[] args) {
		
//		objects of the Student class using the zero-argument constructor;
		System.out.println("using the zero-argument constructor :");
		System.out.println("=====================================");
		
		StudentBean student1 = new StudentBean();
		student1.setRoll(101);
		student1.setName("Rajasekar K");
		student1.setAge(20);
		student1.setMarks(400);
		
		int gRoll = student1.getRoll();
		String gName = student1.getName();
		int gAge = student1.getAge();
		int gMarks = student1.getMarks();
		if(gAge != 0 && gMarks != 0) {
			System.out.println("Roll No.: " + gRoll);
			System.out.println("Name : " + gName);
			System.out.println("Age : " + gAge);
			System.out.println("Marks : " + gMarks);
		}else {
			System.out.println("Enter valid details as: 18<age<60, 0<marks<500");
		}

		System.out.println("\n");
		System.out.println("using the parameterized constructor");
		System.out.println("===================================");
		
//		objects of the Student class using the parameterized constructor;
//		 roll,  name,  age,  marks;
		
		StudentBean student2 = new StudentBean(102,"Vinuth Acharya",30,400);
		
		int gRoll2 = student2.getRoll();
		String gName2 = student2.getName();
		int gAge2 = student2.getAge();
		int gMarks2 = student2.getMarks();
		if(gAge2 != 0 && gMarks2 != 0) {
			System.out.println("Roll No.: " + gRoll2);
			System.out.println("Name : " + gName2);
			System.out.println("Age : " + gAge2);
			System.out.println("Marks : " + gMarks2);
		}else {
			System.out.println("Enter valid details as: 18<age<60, 0<marks<500");
		}
		
		
	}
}
