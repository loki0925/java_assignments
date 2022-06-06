package Que2;

public class Child extends Parent {
	
	public void method1() {
		System.out.println("From method 1 of Child");
		if(number<=10 && number>0) {
			System.out.println("Number is: " + number);
		}
		else {
			System.out.println("Invalid number");
		}
	}
	public void method4() {
		System.out.println("From method 4 of Child");
	}

}
