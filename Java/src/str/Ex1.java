package str;

public class Ex1 {

	public static void main(String[] args) {
		String a = "Indian Team";
		String b = a.toUpperCase();
		String c = a.toLowerCase();
		String d = a.toString();
		int y = a.compareTo("Indian team");
		int z = a.compareToIgnoreCase("indian team");
		boolean x = a.contains("Team");
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		System.out.println(a + " " + b + " " + c + " " + d);

	}

}
