package LoopStatement;

public class Methodwithparameter_noreturntype {
public float add () {
	int n1=5;
	float n2=10.7f;
	float sum=n1+n2;
	return sum;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodwithparameter_noreturntype ob=new Methodwithparameter_noreturntype();
		
		
	System.out.println("sum="+(ob.add()));
		float sum1 =ob.add()	;	
//another method
		System.out.println("sum1="+sum1);
	}

}

