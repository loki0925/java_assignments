package que1;

public interface Y {

void methodY1();
	
	default void methodY2() {
		
		System.out.println("Default method from Interface Y");
	}
	
	static void methodY3() {
		
		System.out.println("Static method from Interface Y");
	}
}
