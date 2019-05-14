abstract class Generation {
	Generation() {
		System.out.println("Complete family members:");
	}

	abstract void grandf();
	abstract void father();
	abstract void grandson();
	abstract void granddaughter();
}

 class Son extends Generation {
	Son() {
		System.out.println("Next Generation Family");

	}

	@Override
	void grandf() {
		System.out.println("First one");
		
	}

	@Override
	void father() {
		System.out.println("Father: eswara ");
		
	}

	@Override
	void grandson() {
		System.out.println("Grandson : Sai");
		
	}

	@Override
	void granddaughter() {
		System.out.println("Cuttest one");
		
	}

		
}

public class Ex1 {
	public static void main(String[] args) {
		Son s = new Son();
		s.grandf();
		s.granddaughter();
		s.father();

	}

}
