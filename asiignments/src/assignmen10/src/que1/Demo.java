package que1;
import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			return new TajHotel();
		}else if(amount<=1000 && amount>200) {
			return new RoadSideHotel();
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Scanner sc = new Scanner(System.in);
		
		int amt;
		System.out.println("Enter the amount: ");
		while(true){
			amt = sc.nextInt();
			if(amt>200) {
				break;
			}
			System.out.println("Please enter a valid amount");
		}
		Hotel h1 = d1.provideFood(amt);
		
		if(h1 instanceof TajHotel) {
			System.out.println("\nWelcome to Taj...!!\n******************************");
			((TajHotel)h1).welcomeDrink();
			h1.chickenBiryani();
			h1.masalaDosa();
		}else if(h1 instanceof RoadSideHotel) {
			System.out.println("\nWelcome to Road Side...!!\n******************************");
			h1.chickenBiryani();
			h1.masalaDosa();
		}else {
			System.out.println("Please enter a valid amount");
		}
	}
}
