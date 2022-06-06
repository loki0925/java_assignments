package que1;

public interface X {

void methodX1();
	
	default void methodX2() {
		
		System.out.println("Default method from Interface X");
	}
	
	static void methodX3() {
		
		System.out.println("Static method from Interface X");
	}
}
