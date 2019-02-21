package inheritance;

class cal{
	public int add(int i,int j) {
		return i+j;
	}}
class calad extends cal
{
	public int sub(int i,int j) {
		return i-j;
	}
}
	


public class SingleInh {

	public static void main(String[] args) {
//		cal c = new cal();
//		int result = c.add(3, 4);
//		System.out.println(result);
		
		cal c1 = new cal();
		int result1 = c1.add(4,2);
		System.out.println(result1);
		
		calad c2 = new calad();
		int result2 = c2.sub(45,41);
		System.out.println(result2);
		

	}

}
