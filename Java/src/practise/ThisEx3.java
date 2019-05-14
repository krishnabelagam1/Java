package practise;

class Emply {
	Emply() {
		System.out.println("Enter an employee ID");
	}

	Emply(int i) {
		this();
		System.out.println(i);
	}

}

public class ThisEx3 {

	public static void main(String[] args) {
		Emply ep = new Emply(201);

	}

}
