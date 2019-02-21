package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("F2");
		li.add("selenium");
		li.add("automation");
		li.add("1,Database");
		//System.out.println("Total imp topic is:" + li.get(2));
		ListIterator<String> itr = li.listIterator();
		System.out.println("Elements in forward direction");
		while (itr.hasNext()) {
			System.out.println("Index is " + itr.nextIndex() + " value " + itr.next());
		}
		System.out.println("Elements in reverse directon");
		while (itr.hasPrevious()) {
			System.out.println("Index is " + itr.previousIndex() + " value " + itr.previous());
		}
		for(String St:li) {
			
		}
		
	}

}
