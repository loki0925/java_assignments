package que2;
import java.util.Scanner;

public class AllStudents {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Science Student Details: ");
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		System.out.println("Enter Student Address: ");
		String add = sc.next();
		System.out.println("Enter Physics Marks out of 100: ");
		int physicsMarks = sc.nextInt();
		System.out.println("Enter Chemistry Marks out of 100: ");
		int chemistryMarks = sc.nextInt();
		System.out.println("Enter Math Marks out of 100: ");
		int mathMarks = sc.nextInt();
		
		Student s1 = new ScienceStudent(name, add, physicsMarks, chemistryMarks, mathMarks);
		
		System.out.println("Percentage Science Student " + s1.name +": "+ s1.getPercentage() + "%\n");
		
		
		System.out.println("*********************************\n");
		
		System.out.println("Enter History Student Details: ");
		System.out.println("Enter Student Name: ");
		String name1 = sc.next();
		System.out.println("Enter Student Address: ");
		String add1 = sc.next();
		System.out.println("Enter Physics Marks out of 100: ");
		int historyMarks = sc.nextInt();
		System.out.println("Enter Chemistry Marks out of 100: ");
		int civicsMarks = sc.nextInt();
		
		Student h1 = new HistoryStudent(name1, add1, historyMarks, civicsMarks);
		
		System.out.println( "Percentage History Student " + h1.name+": " + h1.getPercentage() + "%");
	}
}
