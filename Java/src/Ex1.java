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
		// TODO Auto-generated method stub
		
	}

	@Override
	void grandson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void granddaughter() {
		// TODO Auto-generated method stub
		
	}

		
}

public class Ex1 {
	public static void main(String[] args) {
		Son s = new Son();
		s.grandf();

	}

}
