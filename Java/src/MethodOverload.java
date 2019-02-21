class Adder{
	static int Add(int a,int b) {
		return a+b;
		}
	static int sub(int a, int b,int c) {
		return a-b-c;
		
	}
}


public class MethodOverload {
 public static void main(String[] args) {
	// Adder ad = new Adder();
	System.out.println(Adder.Add(23, 71));
	System.out.println(Adder.sub(1029, 238, 123));
}

}
