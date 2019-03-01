package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort {

	public static void main(String[] args) {
	  ArrayList<String> link = new ArrayList<String>();
	  link.add("yamini");
	  link.add("Aruna");
	  link.add("Triveni");
	  link.add("Induleka");
	  link.add("Mounika");
	  link.add("Aishwarya");
	 Collections.sort(link);
	 /*Iterator<String> al = link.iterator();
	 while(al.hasNext()) {
		 System.out.println(al.next());*/
	 for(String w:link) {
		 System.out.println(w);
		 
	 }

	}

}
