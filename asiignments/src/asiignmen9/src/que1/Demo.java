package que1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using the method (displayDetails())\n");
		Student s1 = new Student(101, "Rocky", 510);
		s1.displayDetails();
		
		System.out.println("\n*************************\n");
		
		System.out.println("Using the method (toString())\n");
		Student s2 = new Student(102, "Adheera", 410);
		System.out.println(s2);

	}

}
