package Logic;

public class Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1=10,num2=100;
	int var1= (num1<num2)?num1-1:num2-1;
	
System.out.println("ternaryopvalu="+var1);

int n1=20,n2=30;

boolean varA=n1<n2;
boolean varB=n1>n2;

System.out.println(varA||varB);
System.out.println(varA!=varB);
System.out.println(varA&&varB);

	
		
		
	}

}
