/*Write a Java program that reads in two floating-point numbers and 
tests whether they are the same up to three decimal places.*/
package same;

import java.util.Scanner;

public class same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Input floating-point number: ");
	        double n1 = sc.nextDouble();
	        System.out.print("Input floating-point another number: ");
	        double n2 = sc.nextDouble();

	        n1 = Math.round(n1 * 1000);
	        n1 = n1 / 1000;

	        n2 = Math.round(n2 * 1000);
	        n2 = n2 / 1000;

	       
	        if (n1 == n2)
	        {
	            System.out.println("They are the same up to three decimal places");
	        }
	        else
	        {
	            System.out.println("They are different");
	        }
	    
	}

}
