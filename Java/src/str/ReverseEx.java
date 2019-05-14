package str;

public class ReverseEx {

	public static void main(String[] args) {
		String x = "We are an Indian . So we should respect our country";
		int y = x.length();
		System.out.println(y);
		String r = " ";
		for (int i = y - 1; i >= 0; i--) {
			char z = x.charAt(i);
			r = r + z;

		}
		System.out.println(r);
	}

}
