package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("rohit");
		set.add("Dhawan");
		set.add("virat");
		set.add("rohit");
//		Iterator<String>itr =set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		System.out.print(set);
		for(String st:set) {
			System.out.println(st);
		}

	}


}