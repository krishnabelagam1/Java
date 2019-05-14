package cp;

public class SampleProgram {

	static int staticvariable;
	int nonstaticvariable;

   //static initializer block
	static {
		staticvariable=5;
		System.out.println("static initializer block");
	}
	SampleProgram() {
		System.out.println("constructor");
	}
//non static initializer block
	{
		nonstaticvariable=7;
		System.out.println("non static initializer block");
		
	}
	//constructor
	
	public static void main(String[] args) {
		SampleProgram obj1 = new SampleProgram();
		SampleProgram obj2 = new SampleProgram();
	}
	
	
	

}
