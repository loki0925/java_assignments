package que3;

public abstract class ExplainInterface {

//	Interface in Java:-
//	The interface in the JAVA is declared by the "Interface" keyword;
//	We can achieve the 100% Abstraction by using the Interface in the Java;
//	Interface have only have the unimplemented methods ie.e only abstract method;
//	In the Interface the variable are by default are the public final;
//	Along with abstract methods, an interface may also contain constants, default methods, 
//	static methods, and nested types. Method bodies exist only for default methods and static methods.
//	
//	Example:-
	
	void method1();
	default void method2() {
		System.out.println("By using default keyword we can give the body to the methods in Interface");
	}
}

class Interface implements ExplainInterface{

	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}
