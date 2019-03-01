package basic;

public class StaticEx1 {
	int a = 30;
	static int b = 34;
	StaticEx1(){
		b++;
		System.out.println(b);
	}

	public static void main(String[] args) {
		//System.out.println(a);
		StaticEx1 se = new StaticEx1();
		StaticEx1 se1 = new StaticEx1();
		StaticEx1 se2 = new StaticEx1();
		
		System.out.println(b);

	}

}
