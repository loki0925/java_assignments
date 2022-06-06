package Que4;
import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("Axis")) {
			return new AxisBank();
		}else if(bank.equalsIgnoreCase("ICICI")) {
			return new ICICIBank();
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String bank = null;
		while(true) {
			System.out.println("Enter Bank Name: ");
			String ban = scan.next();
			if(ban.equalsIgnoreCase("Axis") || ban.equalsIgnoreCase("ICICI")) {
				bank = ban;
				break;
			}else {
				System.out.println("\n" + "*******************");
				System.out.println("Enter Valid Bank Name");
			}
		}
		System.out.println("Enter Branch Name: ");
		String branch = scan.next();
		
		
		System.out.println("Enter IFSC code: ");
		String ifscCode = scan.next();
		
		System.out.println("Enter rate of intrest: ");
		double intrest = scan.nextDouble();
		
		System.out.println("\n" + "*******************");
		
		Bank bank1 = Demo.getBank(bank);
		if(bank1 instanceof AxisBank) {
			System.out.println("Welcome to Axis Bank: ");
			bank1.branchName = branch;
			bank1.ifscCode = ifscCode;
			((AxisBank)bank1).rateOfInterest = intrest;
			((AxisBank)bank1).displayDetails();
			((AxisBank)bank1).getCreditCard();
		}else{
			System.out.println("Welcome to ICICI Bank: ");
			bank1.branchName = branch;
			bank1.ifscCode = ifscCode;
			((ICICIBank)bank1).rateOfInterest = intrest;
			((ICICIBank)bank1).displayDetails();
		}
		
		scan.close();
	
	}

	
}
