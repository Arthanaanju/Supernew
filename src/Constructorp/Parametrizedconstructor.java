package Constructorp;

public class Parametrizedconstructor {

	float areaOfCircle;
	
	public Parametrizedconstructor(float pi,int r) {
		// TODO Auto-generated constructor stub
		areaOfCircle=pi*r*r;
		System.out.println("areaOfCircle="+areaOfCircle);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parametrizedconstructor ob=new Parametrizedconstructor(3.14f,6);
		
	}

}
