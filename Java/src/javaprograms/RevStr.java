package javaprograms;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		sc.close();

	}

}
