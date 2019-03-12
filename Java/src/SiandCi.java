import java.util.Scanner;

public class SiandCi {

	public static void main(String[] args) {
	int a,b,x=0,y=0,z=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first number:");
	a = sc.nextInt();
	System.out.println("Enter second number:");
	b = sc.nextInt();
	if(a<100 && b<100) {
		x = -a;
		y = -b;
		
		System.out.println(x +"and"+ y);
	
	 z = x+y+(x*y/100);
	 System.out.println(z);
	 z=100+z;
	 System.out.println("profit/loss:"+z);
			/*
			 * z=z%100; System.out.println("profit/loss is"+z);
			 */

	}
	if(a>100 && b>100) {
		x = a;
		y = b;
		
		System.out.println(x +"and"+ y);
	
	 z = x+y+(x*y/100);
	 System.out.println(z);
			/*
			 * z=z-100; System.out.println("profit/loss:"+z);
			 */
			/*
			 * z=z%100; System.out.println("profit/loss is"+z);
			 */

	}
	if(a>100 && b<100) {
		x = a;
		y = -b;
		
		System.out.println(x +"and"+ y);
	
	 z = x+y+(x*y/100);
	 z=100+z;
	 System.out.println("profit/loss:"+z);
			/*
			 * z=z%100; System.out.println("profit/loss is"+z);
			 */

	}
	if(a<100 && b<100) {
		x = -a;
		y = b;
		
		System.out.println(x +"and"+ y);
	
	 z = x+y+(x*y/100);
	 System.out.println(z);
	 z=100+z;
	 System.out.println("profit/loss:"+z);
			/*
			 * z=z%100; System.out.println("profit/loss is"+z);
			 */

	}

	
	}

}
