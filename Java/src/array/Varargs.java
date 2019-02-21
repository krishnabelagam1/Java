package array;

class cal{
	public int add(int ... n)//{23,45,34,....}
	{
		int sum =0;
		for(int j:n) {
			sum = sum + j;
		}
	 // System.out.println(sum);
	return sum;
		
	}
}

public class Varargs {

	public static void main(String[] args) {
		cal obj = new cal();
		System.out.println(obj.add(29,30,492,92));
		

	}

}
