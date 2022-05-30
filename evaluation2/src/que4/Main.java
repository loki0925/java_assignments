package que4;

public class Main {

	
	public static Person generatePerson(Person person) {
		
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Teacher());

		System.out.println(newStudent);
		System.out.println(newTeacher)
		}
}
