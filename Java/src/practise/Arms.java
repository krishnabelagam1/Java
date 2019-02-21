package practise;

import java.util.Scanner;

public class Arms {

	public static void main(String[] args) {
		int i,a,n,temp,c = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:" );
		n = s.nextInt();
		temp = n;
		while(n>0) {
			a = n%10;
			n = n/10;
			 c = c +(a*a*a);
		}
		if(temp==c) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is not a armstrong");
		}
		

	}

}
