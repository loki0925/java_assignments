package Que2;

public class Student {
  
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails(){
		System.out.println("Student ID: " + studId);
		System.out.println("Student Name: " + studName);
	}
	public double payFee(double otherfees, double paideFee){
		double remainingFee = paideFee - (this.examFee + otherfees);
		return remainingFee;
	}
	
}
