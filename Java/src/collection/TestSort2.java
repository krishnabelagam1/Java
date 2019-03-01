package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort2 {

	public static void main(String[] args) throws Exception {
		
	  ArrayList<Integer> link = new ArrayList<Integer>();
	  System.out.println("Is ArrayList Empty:"+link.isEmpty());
	  link.add(500);
	  link.add(600);
	  link.add(600);
	  link.add(800);
	  link.add(900);
	  link.add(1000);
	  link.add(3,1300);
	  link.add(Integer.valueOf(1100));
	  System.out.println("Is ArrayList Empty:"+link.isEmpty());
	  System.out.println("Is ArrayList contains :"+link.size());
	  System.out.println("Is ArrayList Deleted:"+link.remove(2));
	  System.out.println("Is ArrayList contains :"+link.contains(900));
	  System.out.println("Is ArrayList contains :"+link.contains(200));
	  System.out.println("Is ArrayList contains :"+link.toString());
	  System.out.println("Is ArrayList contains :"+link.size());
	  System.out.println("Is ArrayList contains :"+link.hashCode());
	  System.out.println("Is ArrayList contains :"+link.indexOf(1));
	  System.out.println("Is ArrayList contains :"+link.add(1200));
	  //System.out.println("Is ArrayList contains :"+link.clone());
	  System.out.println("Is ArrayList contains :"+link.equals(null));
	  System.out.println("Is ArrayList contains :"+link.parallelStream());
	  System.out.println("Is ArrayList contains :"+link.spliterator());
	  //link.wait(2000);
	 Collections.sort(link);
	 /*Iterator<String> al = link.iterator();
	 while(al.hasNext()) {
		 System.out.println(al.next());*/
	/* for(Integer w:link) {
		 System.out.println(w);*/
	 
	 for(int i = 0;i<=link.size();i++) {
		 System.out.print(i);
		 System.out.println("="+link.get(i));
		
		 
	 }

	}

}
