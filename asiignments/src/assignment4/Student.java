package assignment4;

public class Student {
	int roll;
	String name;
	String address;
	String collageName;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "NIT";
	}
	public Student(int roll, String name, String address, String collageName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
}
