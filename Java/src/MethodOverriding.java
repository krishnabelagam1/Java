
class A{
	public void show() {
		System.out.println("in B");
	}
}
class B extends A{
	public void show() {
		System.out.println("in a");
	}
}
class C extends B{
	public void show() {
		System.out.println("in c");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	A a = new B();
//	a.show();
	A a = new C();
	a.show();
	a= new B();
	a.show();
	

	}

}
