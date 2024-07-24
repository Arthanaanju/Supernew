package LoopStatement;
import java.util.Scanner;
public class Forloopwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//factorial
		Scanner var =new Scanner(System.in);
		
		System.out.println("Enter a number for factorial");
int a =var.nextInt();
int fact=1;
for (int i=1;i<=a;i++){
	fact=fact*i;
	
	
}
			System.out.println(fact);
		
		//fibonacci serieas
			
			
			Scanner f =new Scanner(System.in);
			
	int N =f.nextInt();
	int num1=0;
	int num2=1;
	System.out.println("Enter fibonacci series");

			
	for (int i=1;i<=N;i++){
		
		int sum=num1+num2;
		
		 num1=num2;
		 num2=sum;
	}
		
			
	}

}
