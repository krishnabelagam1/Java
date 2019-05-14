package cp;

public class Sample {
	//variable declaration
		static int x=4;
		int y=10;
		String z="java";
		//method
		void display() {
			System.out.println("welcome java");
		}
		static void run() {
			System.out.println("Hello ");
			
		}
		public static void main(String[] args) {
			//creating the object
			Sample obj1 = new Sample();
			System.out.println(obj1.x);
			System.out.println(obj1.y);
			System.out.println(obj1.z);
			obj1.display();
			//calling variables if you are using static:class name.variable
			System.out.println(Sample.x);
			//class name.method
			Sample.run();
			
		}

}
