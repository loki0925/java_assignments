package Que2;

public class ClassCast {
	
	//ClassCast Exception in Java is one of the unchecked exceptions that occur when we try to convert 
		//one class type object into another class type.
		
		//ClassCast Exception is thrown when we try to cast an object of the parent class to the child class object. 
		//However, it can also be thrown when we try to convert the objects of two individual classes 
		//that don't have any relationship between them.
		
		public static void main(String[] args) {
			Parent p1  = new Child(); //we can assign the parent class object, child class object or null to the parent class object
			//we can methods belongs to parent only and Object class which parent for every class in java;
			p1.iAmParent();
			
			//but when we try to cast the parent class to child class without downCasting it will throw the "ClassCastException" error;
			//at the time of run time;
			
			//Example:-
			//Child c1 = p1;
			//c1.iAmChild();
			
			//to access the child methods from parent object we have to downCast it;
			
			//Example:-
			Child c1 = (Child)p1;
			c1.iAmChild();
		}
	}

	class Parent{
		
		public void iAmParent() {
			System.out.println("I am parent");
		}
	}
	class Child extends Parent{
		
		public void iAmChild() {
			System.out.println("I am child");
		}

}
