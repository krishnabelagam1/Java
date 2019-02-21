
abstract class Bus{
	abstract void Add();
}
	class Car extends Bus{

		@Override
		void Add() {
			System.out.println("Safety important");
			
		}
		
	}


public class Abstactcls {

	public static void main(String[] args) {
	Bus b = new Car();
	b.Add();
	}
	}
	