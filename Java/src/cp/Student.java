package cp;

public class Student {
	//no arg based constructor
		Student() {
			System.out.println("object with default variable values");
			
		}
		//arg based constructor
		Student(String str){
			this();
			System.out.println("object with assigned values");
			
		}
		public static void main(String[] args) {
			Student obj = new Student("constructor with values");
			
		}


}
