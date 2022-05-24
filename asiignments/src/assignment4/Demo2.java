package assignment4;


	public class Demo2 {
		public static Student getStudent(boolean isFromNIT) {
			if(isFromNIT){
				Student s1 = new Student(101, "Swanand", "Maharashtra");
				return s1;
			}else {
				Student s2 = new Student(102, "Ratan", "UP","M.G.College");
				return s2;
			}
		}
		public static void main(String[] args) {
			boolean isFromNIT = false;
			
			Student  studentDetails = getStudent(isFromNIT);
			System.out.println("Roll No.: " + studentDetails.getRoll());
			System.out.println("Name : " + studentDetails.getName());
			System.out.println("Address : " + studentDetails.getAddress());
			System.out.println("Collage Nmae : " + studentDetails.getCollageName());
				
		}
}
