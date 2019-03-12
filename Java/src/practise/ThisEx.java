package practise;

public class ThisEx {
	ThisEx(){
		int a=10,b=30;
		System.out.println(a+b);
	}
	ThisEx(int i){
		this();
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		ThisEx x = new ThisEx(20);

	}

}
