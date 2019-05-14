package cp;

public class Car {
	int modelyear;
	String modelname;
	
	//argument based constructor
	Car(int year , String name){
		modelyear=year;
		modelname=name;
		
	}
	public static void main(String[] args) {
		Car mycar = new Car(1950, "yyyyy");
		System.out.println(mycar.modelyear + "  " + mycar.modelname);
		
	}
}
