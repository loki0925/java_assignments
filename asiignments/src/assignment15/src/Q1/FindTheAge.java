package Q1;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FindTheAge {
public static LocalDate dayFormatter(String dob, DateTimeFormatter dtf) throws InvalidDateFormat {
		
		try {
			LocalDate date = LocalDate.parse(dob, dtf);
		
			return date;
		}
		catch(DateTimeException dte) {
			InvalidDateFormat idf = new InvalidDateFormat("please enter the date in proper format");
			throw idf;
		}
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		try {
			LocalDate dob1 = FindTheAge.dayFormatter(dob, dtf);
			
			LocalDate date = LocalDate.now();
			
			if(dob1.isBefore(date)) {
				
				Period p = Period.between(dob1, date);
				
				int year = p.getYears();
				int month = p.getMonths();
				int days = p.getDays();
				
				System.out.println("Your age is: " + year + " years," + month + " months," + days + " days,");
			}else {
				System.out.println("Date should not be in Future");
			}
			
			
			
		}catch (InvalidDateFormat idf){
			System.out.println(idf.getMessage());
		}

	}

}
