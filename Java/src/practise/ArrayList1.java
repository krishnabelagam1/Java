package practise;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("F2");
		li.add("selenium");
		li.add("automation");
		li.add("1,Database");
		System.out.println("Total imp topic is:" +li.get(2));
		for(String sr :li) {
			System.out.println(sr);
			
		}
	}
	
}
