package basic;

class emp {
	int eid;
	static int salary;
	 static String ceo;

	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
}

public class StaticDemo {
	public static void main(String arg[]) {
		emp sai = new emp();
		sai.eid = 120;
		sai.salary = 20000;
		sai.ceo = "sivakumar";
		System.out.println("successfully developed ");

		emp krishna = new emp();
		krishna.eid = 201;
		krishna.salary = 50000;
		krishna.ceo = "hareesh kumar";
		
		emp malli = new emp();
		malli.eid = 891;
		malli.salary = 100000;
		malli.ceo = "nitesh";
		
		emp.salary = 50000;
		emp.ceo="mega star";

		sai.show();
		krishna.show();
		malli.show();
	}

}
