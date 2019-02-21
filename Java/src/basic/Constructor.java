package basic;

class casio {
	int num1;
	int num2;
	String sai;
	
	public casio() {
		num1 = 0;
		num2 = 0;
	}
	public casio(int i) {
		num1 = i;
		num2 = 0;
	}
	public casio(int i,int j,String st) {
		num1 = i;
		num2 = j;
		sai = st;
	}
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void sub(int k, int l) {
		System.out.println(k - l);
	}
	public void multi(int i,int j, int k) {
		System.out.println(i*j*k);
	}

}

public class Constructor {

	public static void main(String[] args) {

		casio obj = new casio();
		
		
		
		obj.add(6, 8);
		obj.sub(46, 19);
		obj.multi(3, 5, 8);
		obj.multi(39, 73, 20);

	}

}
