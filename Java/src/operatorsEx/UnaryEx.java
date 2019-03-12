package operatorsEx;

import java.util.Scanner;

public class UnaryEx {

	 static public void main(String[] args) {
		int i,j;
		int a = 10,b = 20 , c = 30;
		 Scanner sc  = new Scanner(System.in);
	      System.out.println("Enter a number: ");
	      i = sc.nextInt();
	      j = i+i++;
	      System.out.println(j);
	      j = i+(++i);
		  System.out.println(j);
		  System.out.println(10<<2);
		  System.out.println(10>>2);
		  System.out.println(10>>>2);
		  System.out.println(a<b&&b<c);
		  System.out.println(a>b&&b<c);
		  System.out.println(a<b&b<c);
		  System.out.println(a>b&b<c);
		  System.out.println(a<b|b<c);
		  System.out.println(a>b|b<c);
		  

	}

}
