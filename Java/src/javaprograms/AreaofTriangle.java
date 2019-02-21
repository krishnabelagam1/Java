package javaprograms;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		double b,h,A,c;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("breath of a triangle : ");
		 b = sc.nextInt();
		 System.out.println("height of a triange :");
	     h = sc.nextInt();
	     A = ((b*h)/2);
	     System.out.println("Area of Triangle is :" +A);
	     

	}

}
