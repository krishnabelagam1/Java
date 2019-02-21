package practise;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(201, "AA");
		map.put(301, "BB");
		map.put(401, "cc");
		for(Map.Entry E:map.entrySet()) {
			System.out.println("Values are "+E.getKey()+" Formed "+E.getValue());
			
		}

	}

}
