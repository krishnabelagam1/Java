package practise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer>set = new HashSet<Integer>();
		set.add(201);
		set.add(301);
		set.add(401);
		set.add(501);
		System.out.println("Enter elements:");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) 
		{
		System.out.println("Getting elements "+it.next());
	}

}}
