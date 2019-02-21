package exprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0,b = 1,c,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		count = sc.nextInt();
		System.out.print(a+ " "+ b);
		for(int i =0;i<=count;i++) {
		c = a+b;
		System.out.print(" "+c);
		a=b;
		b=c;

	}
	}
}
