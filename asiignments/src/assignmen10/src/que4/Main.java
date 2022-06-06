package que4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		Shape shape = new Area();
		
		System.out.println("To calculate the area of Rectangle: ");
		System.out.println("Enter Length of rectangle in meter: ");
		int length = sc.nextInt();
		System.out.println("Enter Breadth of rectangle in meter: ");
		int breadth = sc.nextInt();
		
		System.out.println("Area of rectangle having L:"+length+"m & B:"+breadth+"m");
		
		int rectangleArea = shape.rectangleArea(length, breadth);
		
		System.err.println("Area of Rectangle: " + rectangleArea + "sq.m.");
		
		System.out.println("\n**************************\n");
		
		System.out.println("To calculate the area of Sqaure: ");
		System.out.println("Enter side of sqaure in meter: ");
		int side = sc.nextInt();
		
		System.out.println("Area of sqaure having Side:"+side+"m");
		
		int squareArea = shape.squareArea(side);
		System.err.println("Area of Sqaure: " + squareArea + "sq.m.");
		
		System.out.println("\n**************************\n");
		
		System.out.println("To calculate the area of Circle: ");
		System.out.println("Enter radius of circle in meter: ");
		int radius = sc.nextInt();
		
		System.out.println("Area of circle having radius:"+radius+"m");
		
		int circleArea = shape.circleArea(radius);
		System.err.println("Area of Circle: " + circleArea + "sq.m.");
		
		sc.close();
	}

}
