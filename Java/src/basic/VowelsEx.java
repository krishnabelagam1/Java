package basic;

import java.util.Scanner;

public class VowelsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = 'o';
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter a letter");
     
      if(s =='a' || s == 'e' || s == 'i' || s== 'o' || s == 'u') {

    	  System.out.println("Given character is vowel");
      }
      else
    	  System.out.println("Given character is consonant");
	}

}
