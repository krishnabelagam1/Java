package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = sc.nextInt();

        while(n != 0) {
            int a = n % 10; // 3
            c = c * 10 + a;// c = 3
           // n /= 10;
          n = n/10;
        }

        System.out.println("Reversed Number: " +c);
        sc.close();
    
	}

}
