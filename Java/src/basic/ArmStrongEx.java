package basic;

public class ArmStrongEx {

	public static void main(String[] args) {
	 int a,c = 0,n,temp;
	 n = 153;
	 temp=n;
	 while(n>0) {
		 a=n%10;
		 n=n/10;
		 c = c +(a*a*a);
	 }
	 if(temp==c) {
		 System.out.println("The given number is Armstrong");
	 }
	 else {
		 System.out.println("The given number is not Armstrong");
	 }
	}

}
