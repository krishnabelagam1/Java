package collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		hm.put(501, "Krishna");
		hm.put(601, "kumar");
		hm.put(701, "kunal");
		System.out.println("present persons");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.putIfAbsent(801, "sai");
		System.out.println("After adding absent persons: ");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(901, "malli");
		System.out.println("Full members of institute:");
		map.putAll(hm);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"="+m.getValue());
		}
		

	}	

}
