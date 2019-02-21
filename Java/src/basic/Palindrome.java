package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	int a,n,c=0,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	n= sc.nextInt();
	temp=n;
	while(n>0) {
		a=n%10;
		n=n/10;
		c = (c*10) +a;
	}
	if(temp==c) {
		 System.out.println("The given number is palindrome");
	 }
	 else {
		 System.out.println("The given number is not palindrome");
	 }

	}

}
