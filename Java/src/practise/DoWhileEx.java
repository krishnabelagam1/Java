package practise;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
	int i = 1,j,k;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter multiple of a number");
    j = sc.nextInt();
    
	do {
		 k = i*j;
		System.out.println(k);
		i++;
		
		
	}while(i<=10);

	}

}
