package practise;

public class StaticVariable {
	int i;
	String s;
	static String st = "CP";

	StaticVariable(int j, String k) {
    i=j;
    s=k;
	}
	public void display() {
		System.out.println(i+" "+s+" "+st);
	}
	public static void modify() {
		 st = "ValueLabs";
	}

	public static void main(String[] args) {
		StaticVariable.modify();
		StaticVariable sv = new StaticVariable(201,"Sai");
		StaticVariable sv1 = new StaticVariable(202,"Krishna");
		StaticVariable sv2 = new StaticVariable(203,"Belagam");
		sv.display();
		sv1.display();
		sv2.display();
		

	}

}
