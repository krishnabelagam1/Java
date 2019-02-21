package collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map = new HashMap<Integer,String>();
		map.put(901, "Krishna");
		map.put(601, "kumar");
		map.put(701, "kunal");
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
