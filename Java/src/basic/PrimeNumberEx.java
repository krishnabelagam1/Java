package basic;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		int i,m=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" this number is not a primenumber ");
		}
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+" this number is not a primenumber");
				flag = 1;
				break;
			}
			
			}
		if(flag==0) {
			System.out.println("This number is a primenumber");
		}

	}

}
