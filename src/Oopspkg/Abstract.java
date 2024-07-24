package Oopspkg;
abstract class vehicle{
	public abstract void start();
	
	public static void speed () {
System.out.println("Max speed=120");
	}
	
}
class Bikes extends vehicle{
	
	public void start() {
		System.out.println("key start");

	}
}

class train extends vehicle{
	
	public void start() {
		System.out.println("button");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
