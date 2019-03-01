package basic;

public class ThisEx {
	
	public void s() {
		int a = 35;
		int b = 91;
		int c = a+b;
		this.m();
		System.out.println(c);
	}
	public void m() {
		int a = 43;
		int b = 102;
		int c = b-a;
		
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
      ThisEx ex = new ThisEx();
      ex.s();
	}

}
