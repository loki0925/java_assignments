package que3;
import java.util.Scanner;


public class Ipl {

public static void homeTeamStadium(Stadium stadium) {
		
		if(stadium.equals(Stadium.WANKHEDE_STADIUM)) {
			System.out.println("This is the home ground of Mumbai Indians");
		}
		else if(stadium.equals(Stadium.CHIDAMBARAM_STADIUM)) {
			System.out.println("This is the home ground of CSK");
		}
		else if(stadium.equals(Stadium.M_CHINNASWAMY_STADIUM)) {
			System.out.println("This is the home ground of RCB");
		}
		else if(stadium.equals(Stadium.EDEN_GARDENS_STADIUM)){
			System.out.println("This is the home ground of KKR");
		}else {
			System.out.println("Enter valid Stadium Name!!");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Stadium Name: ");
		
		String stadium = sc.next();
		while(true) {
			if(stadium.equals(Stadium.CHIDAMBARAM_STADIUM.toString())) {
				Stadium s = Stadium.valueOf(stadium);
				homeTeamStadium(s);
				break;
			}
			else if(stadium.equals(Stadium.EDEN_GARDENS_STADIUM.toString())) {
				Stadium s = Stadium.valueOf(stadium);
				homeTeamStadium(s);
				break;
			}
			else if(stadium.equals(Stadium.M_CHINNASWAMY_STADIUM.toString())) {
				Stadium s = Stadium.valueOf(stadium);
				homeTeamStadium(s);
				break;
			}
			else if(stadium.equals(Stadium.WANKHEDE_STADIUM.toString())) {
				Stadium s = Stadium.valueOf(stadium);
				homeTeamStadium(s);
				break;
			}
			else {
				System.out.println("Enter valid Stadium Name: ");
				stadium = sc.next();
			}
		}
	}
}
