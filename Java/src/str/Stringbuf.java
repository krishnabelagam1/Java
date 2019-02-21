package str;

public class Stringbuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		System.out.println(sb);
		sb.append(" program"); 
		System.out.println(sb);
		sb.insert(2, "guru");
		System.out.println(sb);
		sb.replace(2, 5, "54");
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
