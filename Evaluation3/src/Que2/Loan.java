package Que2;

public class Loan {

	private Loan() {
		
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			return (0.15 * employeeObj.salary);
		}else if(employeeObj instanceof TemporaryEmployee) {
			return (0.1 * employeeObj.salary);
		}else {
			return 0.00;
		}
	}
}
