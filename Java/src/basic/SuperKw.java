package basic;
class stud{
	public int  A(int i) {
		return i;
		}
	public int AA(int i,int j) {
		return i+j;
	}
}

class teach extends stud
{
	public int B(int i) {
		return i;
	}
	public int BB(int i,int j) {
		return i+j;
	}
}

public class SuperKw {

	public static void main(String[] args) {
//	 stud a = new stud ();
//	 int result = a.AA(40, 50);
//	 System.out.println(result);
//	 teach a1 = new teach();
//	 int result1 = a1.BB(50, 20);
//	 System.out.println(result1);
//	 
		teach a = new teach();
		 int result = a.AA(40, 50);
		 int result1 = a.A(51);
		 System.out.println(result);
		 System.out.println(result1);
		
		

	}

}
