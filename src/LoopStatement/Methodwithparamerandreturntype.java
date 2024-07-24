package LoopStatement;

public class Methodwithparamerandreturntype {

	public float add (int n1,float n2) {
		float sum=n1+n2;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodwithparamerandreturntype ob= new Methodwithparamerandreturntype();
		System.out.println("sum="+(ob.add(2,3.5f)));

		
	}

}
