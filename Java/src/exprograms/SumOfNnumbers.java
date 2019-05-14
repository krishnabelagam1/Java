package exprograms;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum of numbers ");
	    n = sc.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter the "+ n +" number is");
	    for(int i =0 ; i<n;i++) {
	    	System.out.println("Enter number "+(i+1)+":");
	    	a[i]=sc.nextInt();
	    }
	    for(int i = 0;i<n;i++) {
	    	sum +=a[i];
	    }
	    System.out.println("Sum of "+n+" numbers is ="+sum);
	    


	}

}
