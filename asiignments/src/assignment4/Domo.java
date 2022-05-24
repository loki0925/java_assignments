package assignment4;

public class Domo {
	String s;
	int i;
	float f;
	
	public Demo() {
		System.out.println("This from Empty Constructor: " );
	}
	public Demo(String s) {
		this(90);
		this.s = s;
		System.out.println("This from String : " + s);
	}
	public Demo(int i) {
		this(22.50f);
		this.i = i;
		System.out.println("This from int : " + i);
	}
	public Demo(float f) {
		this();
		this.f = f;
		System.out.println("This from float : " + f);
	}
	public static void main(String[] args) {
		
		Demo demo = new Demo("Rajasekar");
		
	}
	
}
