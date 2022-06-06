package Que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****Day Scholar***");
		
		DayScholar s1 = new DayScholar(18000);
		s1.studId = 101;
		s1.studName = "Abhishek";
		s1.examFee = 1800;
		double totalS1 = (s1.transportFee+s1.examFee);
		
		s1.displayDetails();
		System.out.println("Amount to be paid: Rs." + totalS1);
		System.out.println("Please enter the Amount: ");
		double enterAmountS1 = sc.nextDouble();
		
		double s1Fee = s1.payFee(s1.transportFee,enterAmountS1);
		
		if(s1Fee<0) {
			System.out.println("Remaining amount to be paid: Rs." + Math.abs(s1Fee));
		}else if(s1Fee>totalS1){
			System.out.println("Thank you for Paying Fees!");
			System.out.println("Balance Amount: " + s1Fee);
		}else {
			System.out.println("Thank you for Paying Fees!");			
		}
		
		System.out.println("\n");
		
		System.out.println("****Hosteller***");
		
		Hosteller h1 = new Hosteller(40000);
		h1.studId = 102;
		h1.studName = "Vikas";
		h1.examFee = 1800;
		double totalH1 = (h1.hostelFee+h1.examFee);
		
		h1.displayDetails();
		System.out.println("Amount to be paid: Rs." + totalH1);
		System.out.println("Please enter the Amount: ");
		double enterAmountH1 = sc.nextDouble();
		
		double h1Fee = h1.payFee(h1.hostelFee,enterAmountH1);
		
		if(h1Fee<0) {
			System.out.println("Remaining amount to be paid: " + Math.abs(h1Fee));
		}else if(h1Fee>totalH1){
			System.out.println("Thank you for Paying Fees!");
			System.out.println("Balance Amount: " + h1Fee);
		}else {
			System.out.println("Thank you for Paying Fees!");			
		}
		sc.close();
	}
}
