package Que3;

public class DynamicPoly {
	
	//The word polymorphism is a combination of two words i.e. ploy and morphs. 
		//The word poly means many and morphs means different forms.
		
		//Dynamic polymorphism is a process or mechanism in which a call to an overridden method is to 
		//resolve at runtime rather than compile-time. 
		//It is also known as runtime polymorphism;
		//Dynamic polymorphism can achieve by using the method overriding;
		
		public static void main(String[] args) {
			Parent p1 = new Child();
			//As parent object is created by using the child class object then the the method is overriden in child object will be called
			//No matters that the method is present in the parent object itself;
			//Each method present in the child object if it is from the parent is by default overriden;
			p1.methodParent();
		}

	}

	class Parent{
		
		int x = 10;
		String name = "Parent";
		
		public void methodParent(){
			System.out.println("THis from.." + name);
		}
	}

	class Child extends Parent{
		
		int x = 11;
		String name = "Child";
		
		@Override
		public void methodParent(){
			System.out.println("THis from.." + name);
		}

}
