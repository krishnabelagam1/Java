package practise;

public class Conex {
	static int id ;
	String st;
	static int i = 100;
	Conex(int j,String s){
		id = j;
		st = s;
		}
	void display() {
		System.out.println(id+" "+st+" "+i);
	}
	void great() {
		System.out.println(id+i);
		this.display();
	}

	public static void main(String[] args) {
		Conex e =new Conex(40, "sai");
	
		
		//e1.display();
		e.great();
		

	}

}
