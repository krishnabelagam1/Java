package basic;

class outer{
	static int i ;
	static double d ;
	static String sr ;
	public static void show() {
		System.out.println("is showed");
		System.out.println(sr+" age is "+i+",and his batting average is "+d);
	}
	 static class inner{
//		int i = 20;
//		double d = 43.4;
//		 String sr = "kohli";
		public void display() {
			System.out.println("is verified");
			System.out.println(sr+" age is "+i+",and his batting average is "+d);
		}
	}
}


public class Innerclass {

	public static void main(String[] args) {
	  outer obj = new outer();
	  obj.i= 30;
	  obj.d= 201.32;
	  obj.sr = "rohit";
	  
	  outer obj2 = new outer();
	  obj2.i=40;
	  obj2.d= 323.23;
	  obj2.sr = "dhawan";
	  outer.inner obj1 = new outer.inner();
	  obj1.display();
      obj.show();
	}

}
