package Googleclassroomwork;
import java.util.Scanner;
public class Result_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter the first number");
		int p= scan.nextInt();
		
		System.out.println("Enter the second number");
		int q= scan.nextInt();
		
		System.out.println("Enter the third number");
		int r= scan.nextInt();
		
		boolean result= ((p + q) == r || (q + r) == p || (r + p) == q);

		System.out.println("the result is"+" "+result);


	}

}
