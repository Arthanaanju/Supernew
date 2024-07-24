package LoopStatement;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner f =new Scanner(System.in);
		
		int N =f.nextInt();
		int num1=0;
		int num2=1;
		System.out.println("Enter fibonacci series");
\
				
		for (int i=1;i<=10;i++){
			
			int sum=num1+num2;
			
			 num1=num2;
			 num2=sum;
		}
		
		System.out.println("Enter fibonacci series:"+N);

	}

}
