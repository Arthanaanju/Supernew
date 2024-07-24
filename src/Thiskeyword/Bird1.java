package Thiskeyword;

public class Bird1 {
public void sound() {

	System.out.println("Tweet...tweet");
}
}

public class Crow extends Bird1 {
public void sound() {

	System.out.println("kaa...ka");
	
}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		crow ob=new crow();
		ob.sound();
	
	}

}
