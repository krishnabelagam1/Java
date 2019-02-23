package basic;

import java.util.Scanner;

public class FactorialRet {

	
	public static int factorial(int num) {
		int fact = 1;
		if(num==0) 
			return 1;
			for(int i=1;i<=num;i++) {
				fact = fact * i ;
			}
			return fact;
		}
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
		return (num*fact(num-1));
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			System.out.println("factorial of "+n+" is "+ factorial(n));
			System.out.println(factorial(7));
			System.out.println(fact(8));
		}
	
}
