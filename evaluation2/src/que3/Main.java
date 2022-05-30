package que3;
 import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//Write logic to get numberOfPassenger and numberOfKms

		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
	}

}
