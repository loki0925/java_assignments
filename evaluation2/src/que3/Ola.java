package que3;

public class Ola {

	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger >=3) {
			Car a1 = new HatchBack();
			return a1;
		}
		else {
			Car a2 = new Sedan();
			return a2;
		}
	}

	public int calculateBill(Car car) {
		Car c1 = new Car();
		
		Total fare=numberOfKms*farePerKm;
	}
}
