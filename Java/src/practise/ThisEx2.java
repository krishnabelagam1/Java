package practise;
class Student {
	int a;
	String st;
	float f;
	Student(int a,String st,float f){
		this.a = a;
		this.st = st;
		this.f = f;
		}
	void display() {
		System.out.println(a+" "+st+" "+f);
	}
	
}
public class ThisEx2 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"sai",32.3f);
		Student s2 = new Student(102,"krishna",39.13f);
		s1.display();
		s2.display();
		
		

	}

}
