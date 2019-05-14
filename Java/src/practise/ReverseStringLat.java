package practise;

import java.util.Scanner;

public class ReverseStringLat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s = sc.nextLine();
		int a = s.length();
		System.out.println(a);
		String c = "  ";
		for (int b = a - 1; b >= 0; b--) {
			char d = s.charAt(b);
			c = c + d;

		}
		System.out.println(c);
		sc.close();

	}

}
