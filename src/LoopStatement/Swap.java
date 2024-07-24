package LoopStatement;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter the value of a");
		int a=scan.nextInt();
		
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		
		
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println("number a="+ a);
	System.out.println("number b="+ b);

		
	}

}
