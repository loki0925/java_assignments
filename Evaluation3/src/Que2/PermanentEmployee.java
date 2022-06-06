package Que2;

public class PermanentEmployee extends Employee {
	private double basicPay;

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub]
		double pf = this.basicPay * 0.12 ;
		this.salary = this.basicPay - pf;
		
	}
	
	public PermanentEmployee(int employeeId,  String employeeName, double basicPay) {
		
		this.basicPay = basicPay;

	}

}
