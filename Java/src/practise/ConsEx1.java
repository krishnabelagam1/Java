package practise;

public class ConsEx1 {
   int a = 10;
   String st = "name";
   ConsEx1(int b,int c){
	   System.out.println(b+c);
	   
   }
   void display() {
	   System.out.println(a+" "+st);
   }
	public static void main(String[] args) {
		
     ConsEx1 e = new ConsEx1(210,320);
     e.display();
     
	}

}
