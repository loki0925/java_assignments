package Que1;
import java.util.Scanner;

public class ArrayEa {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try{
		
		System.out.println("Enter the number of elements in the array");
		
		  int a = sc.nextInt();
		int[] b = new int[a];
		System.out.println("Enter the elements in the array");
		
		for( int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int c = sc.nextInt();
		}
		
	catch(Exception Ae){
		
	}
}
}