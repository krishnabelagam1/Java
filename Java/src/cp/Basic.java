package cp;

public class Basic {

	//method
	public void hello() {
		System.out.println("welcome to java");
	}
	//passing method parameters in method
	public void writetext(String text) {
		System.out.println(text);
		
	}
	//passing 2 method parameters
	public void Text(String text1 ,String text2) {
		System.out.println(text1);
		System.out.println(text2);
		
	}
	//method return types
	//return type is int for sum method
	public int sum(int value1 ,int value2) {
		return value1+value2;
		
	}
	//return type is string
	public String concat(String string1, String string2) {
	    return string1 + string2;
	}
	//return type is double
	public double product(double value1, double value2) {
		return value1*value2;
	}
	//return type is float
	public float diff(float value1 , float value2) {
		return value1-value2;
	}
	public static void main(String[] args) {
		Basic obj1 = new Basic();
		obj1.hello();
		obj1.writetext("Hai");
		obj1.Text("core", "java");
		System.out.println(obj1.sum(2, 5));
		System.out.println(obj1.concat("xxx", "yyyy"));
		System.out.println(obj1.product(12.2, 2.2));
		System.out.println(obj1.diff(10.6f, 2.2f));
	}
	


}
