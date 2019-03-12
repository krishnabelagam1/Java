package abstractpro;

abstract class Basic {
	abstract void display();
}
class machine extends Basic{
	void display() {
		System.out.println("displayed");
		}}
class trend extends Basic{
	void display() {
				System.out.println("active");
	}
	public static void main(String[] args) {
		Basic b = new trend();
		b.display();
	}
	}