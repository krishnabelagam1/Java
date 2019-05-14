package basic;

import java.util.Scanner;

public class ReverseStringBuf {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter a Sentense :");
		  String n = sc.next();
		 
	    StringBuilder sb =  new StringBuilder(n);
	    System.out.println(sb.reverse());
	    sc.close();
	    

	}

}
