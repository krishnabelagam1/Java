
class K{
	public void show() {
		System.out.println("in A");
	}
	}
class L extends K{
	@Override
	public void show() {
		super.show();
		System.out.println("in B");
	
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L a = new L();
		a.show();

	}

}
