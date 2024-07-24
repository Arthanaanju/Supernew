package LoopStatement;
import java.util.Scanner;
public class Methodscanner {

	public void add() {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter first number");
	int n1=scan.nextInt();
	
	System.out.println("Enter second number");
	int n2=scan.nextInt();
	
	int sum=n1+n2;
	System.out.println("sum="+sum);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodscanner ob =new Methodscanner();
		ob.add();
		
		
		
	}

}
