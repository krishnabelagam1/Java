package basic;

class ply {
	int pid;
	static int salary;
	static String pwife;

	static {
		pwife = "keerty";
		salary = 30000;
		System.out.println("wife name is verified");
	}

	public ply() {
		pid = 204;
		
		System.out.println("Player id and salary are verified");
	}

	public void show() {
		System.out.println(pid + ":" + salary + ":" + pwife);
	}
}

public class StaticDemo2 {
	public static void main(String arg[]) {
		ply sai = new ply();
		ply krishna = new ply();
		sai.show();
		krishna.show();

	}

}
