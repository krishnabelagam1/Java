package basic;

import java.util.Scanner;

public class LeapYearEX {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		year = sc.nextInt();
		if(((year % 4 ==0) && (year % 100 != 0))||(year % 400 == 0)) {
			System.out.println("Specified number is a leap year");
		}
		else {
			System.out.println("Specified number is a not leap year");
		}
	}

}
