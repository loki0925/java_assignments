package que2;
import java.util.*;
public class Demo {
	
	static Student setDetails(Scanner sc) {
		System.out.println("Enter the Roll  : ");
		int roll = sc.nextInt();
		System.out.println("Enter the name  :  ");
	
		String name = sc.next();
		
		System.out.println("Enter the Address  : ");
		String addr = sc.next();
		System.out.println("Enter the Marks : ");
		int marks = sc.nextInt();
		System.out.println("===============");
		System.out.println();
		
		return new Student(roll, name, addr, marks);
	}
	static void printDetails(Student s, int i) {
		System.out.println("Details  "+i);
		System.out.println("Roll  "+s.getRoll());
		System.out.println("Name "+s.getName());
		System.out.println("Address  "+s.getAddress());
		System.out.println("Marks  "+s.getMarks());
		System.out.println("=======");
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Student : " );
		int n = scanner.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0; i<n; i++) {
			student[i] = Demo.setDetails(scanner);
		}
		for(int i=0; i<n; i++) {
			Demo.printDetails(student[i], i);
		}
		
	}
}
