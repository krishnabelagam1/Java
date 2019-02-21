package javaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int c=0,n,temp,a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		 n = s.nextInt();
		 temp =n;
		 while (n>0) { 
			 a = n%10;  //a = 9  a = 6 a = 9
			 c = (c*10)+a; // c =9 c = 96 c = 969
			 n=n/10;  // n = 96 n = 9
		 }
		if(temp==c)
			System.out.println("given number is palindrome");
		else
			System.out.println("Given number is not a palindrome");
	}

}
