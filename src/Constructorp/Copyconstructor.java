package Constructorp;

public class Copyconstructor {
	float areaOfCircle;
	
	public Copyconstructor(float pi,int r) {
	// TODO Auto-generated constructor stub
	areaOfCircle=pi*r*r;
	}

	public void display() {
		System.out.println("areaOfCircle="+areaOfCircle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Copyconstructor ob =new Copyconstructor(3.14f,5);
	ob.display();
	
	Copyconstructor ob1 =new Copyconstructor(3.14f,5);
	ob1.display();

	
}
}

	
	
	
	
	
