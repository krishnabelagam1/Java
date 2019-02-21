package practise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<String>set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("DD");
		System.out.println("Enter elements:"+set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
	System.out.println("Getting elements "+it.next());
	}
		HashSet<String> set1 = new HashSet<String>();
		set1.add("EE");
		set1.add("FF");
		set1.add("GG");
		set1.add("HH");
		set1.addAll(set);
		System.out.println("Enter all elements:"+set1);
		for(String se:set1) {
			System.out.println(se);
		}
		Iterator <String> lit = set1.iterator();
		while(lit.hasNext()){
			System.out.println("finding "+lit.next());
			
		}
}}
