package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();

        while(num != 0) {
            int digit = num % 10; // 3
            reversed = reversed * 10 + digit;// rev = 3
           // num /= 10;
          num = num/10;
        }

        System.out.println("Reversed Number: " + reversed);
    
	}

}
