package com.masai;

public class PrimeFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 12;
		
		if(n>100 || n<=2) {
    		System.out.println("Invalid number");
    	}
    	else {
			int	div = 1;
		
			while(div<=n){
			    if(n % div == 0){
			       System.out.println(div);
			    }
			      div++;    
			  }
    	}

	}

}
