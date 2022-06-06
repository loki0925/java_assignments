package que2;

public abstract class Student {

	String name;
	String adrress;
	
	abstract double getPercentage();

	public Student(String name, String adrress) {
		this.name = name;
		this.adrress = adrress;
	}
}
