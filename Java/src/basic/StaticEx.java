package basic;

public class StaticEx {
	
	  int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";
	   static String city = "vskp";
	   //static variable  
	   //constructor  
	   StaticEx(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college+" "+city);}  
	 
	//Test class to show the values of objects  
	//public class TestStaticVariable1{  
	 public static void main(String args[]){  
		 StaticEx s1 = new  StaticEx(111,"Karan");  
		 StaticEx s2 = new  StaticEx(222,"Aryan");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
	 }  

}
