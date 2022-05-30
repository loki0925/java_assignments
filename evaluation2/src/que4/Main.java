package que4;

public class Main {

	
	public static Person generatePerson(Person person) {
		person.address = new Address();
		person.address.city = "Chennai";
		person.address.state = "TN";
		person.address.pinCode = "60001";
		person.gender = "male";
		person.name = "Ram";
		if(person instanceof Student) {
			Student p = (Student)person;
			p.courseEnrolled = "JA111";
			p.studentId = 1;
			p.courseFee = 300000;
			
			return (Person)p;
		}else {
			Instructor i = (Instructor)person;
			i.instructorId = 456;
			i.salary = 45612;
			return (Person)i;
		}
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}
