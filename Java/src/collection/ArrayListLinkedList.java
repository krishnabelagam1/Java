package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Dhoni");
		li.add("Kohli");
		li.add("Rohit");
		li.add("Williamson");
		List<String> li2 = new LinkedList<String>();
		li2.add("Karthik");
		li2.add("Rahane");
		li2.add("Ashwin");
		li2.add("Shreya's Iyer");
		System.out.println("ArrayList: "+li);
		System.out.println("LinkedList: "+li2);
		

	}

}
