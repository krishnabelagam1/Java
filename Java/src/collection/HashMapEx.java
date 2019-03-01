package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101,"Android");
		hm.put(102,"Basic");
		hm.put(103," c lang");
		hm.put(104,"Design");
		hm.put(105,"Effects");
		hm.put(106,"Foreign");
		System.out.println(hm.put(107, "graphics"));
		System.out.println(hm.putIfAbsent(108, "Hadoop"));
	   
		for(Map.Entry<Integer,String> e:hm.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
			}
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(109, "Ideology");
		map.putAll(hm);
		
		System.out.println(map.size());
		
		

	}

}
