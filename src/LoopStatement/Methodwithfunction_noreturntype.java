package LoopStatement;
import java.util.Scanner;
public class Methodwithfunction_noreturntype {

	public void add (int n1,int n2) {
		
		int sum=n1+n2;
		System.out.println("sum=+sum");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodwithfunction_noreturntype ob= new Methodwithfunction_noreturntype();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first no");
		int a= scan.nextInt();
		
		System.out.println("Enter Second no");
		int b= scan.nextInt();
		
		float sum1 =ob.add();	;	
		
		System.out.println("sum="+(sum));
	}

}
