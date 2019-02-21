package array;

public class JaggedArr {

	public static void main(String[] args) {
		int a[] = { 21, 22, 23, 24 };
		int b[] = { 31, 32 };
		int c[] = { 41, 42, 43, 44,45 };
		int d[] = { 51, 52, 53 };

		int e[][] = { { 21, 22, 23, 24 }, { 31, 32 }, { 41, 42, 43, 44,45 }, { 51, 52, 53 } };

		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				System.out.print(" " + e[i][j]);
			}
			System.out.println();
		}

	}

}
