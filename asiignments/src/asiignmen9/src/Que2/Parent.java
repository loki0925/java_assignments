package Que2;

public class Parent {
int number;
	
	public void method1() {
		System.out.println("From method 1 of parent");
		if(number<=10 && number>0) {
			System.out.println("Number is: " + number);
		}
		else {
			System.out.println("Invalid number");
		}
	}
	
	final public void method2() {
		System.out.println("From method 2 of parent");
	}
	
	final public void method3() {
		System.out.println("From method 3 of parent");
	}
}
