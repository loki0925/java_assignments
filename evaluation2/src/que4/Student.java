package que4;

public class Student extends Person {

	int studentId;
	String courseEnrolled;
	int courseFee;
	
	
	public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFeel) {
		super(name, gender, address);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFeel;
	}
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [StudentId="+this.studentId+", CourseFees = "+this.courseFee+" courseEnrolled = "
				+ ""+this.courseEnrolled+"Address = "+this.address;
	}
	
	
}
