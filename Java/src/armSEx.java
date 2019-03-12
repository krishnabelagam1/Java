import java.util.Scanner;

public class armSEx {

	public static void main(String[] args) {
		int a , n, c = 0,temp;
		Scanner sc  = new Scanner(System.in);
	      System.out.println("Enter a number");
	      n = sc.nextInt();
	      temp = n;
	      while(n>0) {
	    	  a = n%10;
	    	  n = n/10;
	    	  c = c + (a*a*a);
	      }
	      if(temp==c) {
	    	  System.out.println("given number is armstrong");
	    	   }
	      else {
	    	  System.out.println("Given number is not armstrong");
	      }

	}

}
