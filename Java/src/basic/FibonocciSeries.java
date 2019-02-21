package basic;

public class FibonocciSeries {

	public static void main(String[] args) {
		int a,b,c,count=10;
		a=0;b=1;
		
	System.out.print(a+" "+b);
	for(int i =1;i<count;i++) {
		c= a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
	}

	}

}
