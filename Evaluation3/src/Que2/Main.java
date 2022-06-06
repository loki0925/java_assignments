package Que2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		PermanentEmployee ayush = new PermanentEmployee(1,"ayush",5000);
		ayush.calculateSalary();
		
		TemporaryEmployee biggi = new TemporaryEmployee(1,"biggi",1,100);
		biggi.calculateSalary();
		
		
	}

}
