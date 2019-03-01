
abstract class Sun{
	
	  Sun(){ System.out.println("Head of the universe"); }
	 
	 void Mercury(){
		System.out.println("Head of the solar system");
	}
}
class Stars extends Sun{
	Stars(){
		System.out.println("Creator of the god");
		}
	public void moon() {
		System.out.println("One of the stars");
	}
}

public class AbstractEx2 {
	public static void main(String[] args) {
		Sun st = new Stars();
		st.Mercury();
		//st.moon();
	}

}
