package basic;

import java.util.Scanner;

public class Alzebra {

	public static void main(String[] args) {
		int a , b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		c = a*a+b*b+2*a*b;
		System.out.println("Final output : " +c);
		sc.close();
	}

}
