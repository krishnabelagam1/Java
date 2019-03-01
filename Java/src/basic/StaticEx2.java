package basic;

public class StaticEx2 {
	int a = 30;
	 int b = 34;
	StaticEx2(){
		b++;
		a--;
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		//System.out.println(a);
		StaticEx2 se = new StaticEx2();
		StaticEx2 se1 = new StaticEx2();
		StaticEx2 se2 = new StaticEx2();
		
		

	}

}
