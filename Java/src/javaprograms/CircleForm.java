package javaprograms;

import java.util.Scanner;

public class CircleForm {

	public static void main(String[] args) {
	  double r,A,P;
	  Scanner sc = new Scanner(System.in);
		 System.out.println("Radius of a circle is : ");
		 r = sc.nextInt();
		/*
		 * System.out.println("height of a triange :"); h = sc.nextInt();
		 */
		 A = (r*r)*3.14;
		 System.out.println("Area of circle is :"+A);
		 P = 2*3.14*r;
		 System.out.println("Perimeter of circle is : "+P);
	  

	}

}
