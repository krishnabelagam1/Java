package exprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		 List list = new ArrayList<>();  
	     list.add(10);  
	     list.add(50);  
	     list.add(30);  
	     Iterator i = list.iterator();  
	     System.out.println("printing the list....");  
	     while(i.hasNext())
	     {  
	         System.out.println(i.next());  
	     }  

	}

}
