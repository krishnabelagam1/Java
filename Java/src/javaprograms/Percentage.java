package javaprograms;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
	 double i,j;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter an amount to know percentage: ");
	 i = sc.nextInt();
	 System.out.println("Enter a percentage :");
     j = sc.nextInt();
     double k = (i*(j/100));
     System.out.println("Interest of given amount : " +k);
     k = k+i;
     System.out.println("Total principle of given amount :" +k);
	}

}
