package basic;




public class StaticNum {
	
	static int cube(int x) {
		return (x*x*x);
		
	}

	public static void main(String[] args) {
		int result = StaticNum.cube(10);
		System.out.println(result);

	}

}
