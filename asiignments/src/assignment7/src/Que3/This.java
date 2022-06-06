package Que3;

public class This {

	//The this keyword refers to the current object in a method or constructor.
		//"this" can be used to refer the integer belongs to current object;
	
	int x = 10;
   String name  = "sam";
	
	public This() {
		System.out.println("This from empty ");
	}
	public This(String name) {	
		this();
		this.name = name;
		System.out.println("This from string " + name);
	}
	public This(int x) {
		this("sam");
		this.x = x;
		System.out.println("This from integer " + x);
	}
	public static void main(String[] args) {
		This t1 = new This(10);
		
	}
}
