/**
 * 
 */
package basic;

import java.util.Scanner;

/**
 * @author 
 * multiplication of any number
 *
 */
public class Multiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		i = s.nextInt();
		/*
		 * System.out.println("enter another number:"); j = s.nextInt();
		 */
	
			for(j =1;j<=12;j++) {
				int k = i*j;
				System.out.println(i+" * "+j+" = " +k);
				
			
			
		}

	}

}
