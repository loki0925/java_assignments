package Que1;
import java.util.Scanner;

public class Main {

	public static void setDetails(Member m, Scanner sc) {
		System.out.println("Enter Name(String) : ");
		m.name = sc.nextLine();
		
		System.out.println("Enter Age(int) : ");
		m.age = sc.nextInt();
		
		System.out.println("Enter Phone Number(String) : ");
		sc.nextLine();
		m.phoneNumber = sc.nextLine();
		
		System.out.println("Enter Address(String) : ");
		m.address = sc.nextLine();;
		
		System.out.println("Enter Salary(double) : ");
		m.salary = sc.nextDouble(); 
	}
	
	public static void setDetails(Employee e, Scanner sc) {
		setDetails(((Member)e), sc);
		System.out.println("Enter Specialisation(String) : ");
		sc.nextLine();
		e.specialisation = sc.nextLine();
		
		System.out.println("Enter Department(String) : ");
		e.department = sc.nextLine();;
	}
	
	public static void setDetails(Manager m, Scanner sc) {
		setDetails((Member)m, sc);
		System.out.println("Enter Specialisation : ");
		sc.nextLine();
		m.specialisation = sc.nextLine();
		
		System.out.println("Enter Department : ");
		m.department = sc.nextLine();
	}
	
	
	
	public static void getDetails(Employee e) {
		getDetails((Member)e);
		System.out.println("Specialisation : "+e.specialisation);
		System.out.println("Department : "+e.department);
	}
	public static void getDetails(Manager e) {
		getDetails((Member)e);
		System.out.println("Specialisation : "+e.specialisation);
		System.out.println("Department : "+e.department);
	}
	public static void getDetails(Member m) {
		System.out.println("Name : "+m.name);
		System.out.println("Age : "+m.age);
		System.out.println("Phone Number : "+m.phoneNumber);
		System.out.println("Address : "+m.address);
		System.out.println("Salary : "+m.salary);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		setDetails(emp, sc);
		getDetails(emp);
		
		System.out.println("************************************************************");
		
		Manager mng = new Manager(); 
		setDetails(mng, sc);
		getDetails(mng);		
		
		sc.close();
	}
}
