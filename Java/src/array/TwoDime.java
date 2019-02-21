package array;

public class TwoDime {

	public static void main(String[] args) {
		int a[] = { 21, 22, 23, 24 };
		int b[] = { 31, 32, 33, 34 };
		int c[] = { 41, 42, 43, 44 };
		int d[] = { 51, 52, 53, 54 };

		int e[][] = { { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 }, { 51, 52, 53, 54 } };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + e[i][j]);
			}
			System.out.println();
		}

		for (int k[] : e) // enhanced for loop
		{
			for (int l : k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}

	}

}
