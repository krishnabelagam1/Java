package array;

class student{
	int i[] = {20,30,40,50};
	String sr;
}

public class OneDime3 {

	public static void main(String[] args) {
		student s1= new student();
		student s2= new student();
		student s3= new student();
		student s4= new student();
		student s[] = {s1,s2,s3,s4};
	
		
	 
	  for(int i = 0;i<=5;i++) {
		  System.out.println(s[i]);
	  }
	  
	  System.out.println("Print array index successfully");

	}

}
