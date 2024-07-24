package Oopspkg;
import java.util.Scanner;
class AgelimitExceptin extends RuntimeException
{
	public AgelimitExceptin(String msg) {
	super(msg);
}
}
public class Throwspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		if (age<18) {
			throw new AgelimitExceptin("below 18 is not eligible");	
		}
		else {
			System.out.println("eligible for votting");
		}
		
		System.out.println("HELLO");

	}

}
