package inheritance;

class caladv2 extends calad
{
	public int multi(int i , int j) {
		return i*j;
	}
}
	


public class MultiInhe {

	public static void main(String[] args) {
//		cal c = new cal();
//		int result = c.add(3, 4);
//		System.out.println(result);
		
//		cal c1 = new cal();
//		int result1 = c1.add(4,2);
//		System.out.println(result1);
//		
//		calad c2 = new calad();
//		int result2 = c2.sub(45,41);
//		System.out.println(result2);
//		
		caladv2 c = new caladv2();
		int result1 = c.add(45, 34);
		int result2 = c.sub(345, 213);
		int result3 = c.multi(234, 123);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
