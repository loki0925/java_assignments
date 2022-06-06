package Que3;

public class Super {
	//The super keyword refers to superclass (parent) objects. 
		//It is used to call superclass methods, and to access the superclass constructor. 
		//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses,
		//that have methods with the same name.
	

	public static void main(String[] args) {
		Vehicle myDog = new Bike(); 
		myDog.run();
	}
}	
//Example:-

class Vehicle {
	
	public void run() {
	  System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	
	public void run() {
		super.run();
		System.out.println("The bike is running");
	}

}
