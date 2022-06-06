package Que2;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.salary = this.hoursWorked * this.hourlyWages;
		
	}
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;

	}


}
