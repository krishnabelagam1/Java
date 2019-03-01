package basic;
  	class StaticMethEx1{
int rollnum;
String name;
static int  id = 100;
static void change() {
	id = 200;
}
StaticMethEx1(int a,String n){
	rollnum = a;
	name = n;
	 }
void display() {
	System.out.println(rollnum+" "+name+" "+id);
}
  	}
public class StaticMethEx {
	
	public static void main(String[] args) {
		StaticMethEx1.change();
		StaticMethEx1 s1 = new StaticMethEx1(29,"sai krishna");
		StaticMethEx1 s2 = new StaticMethEx1(30,"triveni");
		StaticMethEx1 s3 = new StaticMethEx1(31,"Abhishek");
		s1.display();
		s2.display();
		s3.display();
		

	}

}
