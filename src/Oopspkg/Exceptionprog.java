package Oopspkg;



public class Exceptionprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hai");
		try {
			
			int arr[]= {1,2,3,4};
			System.out.println(arr[5]);
		
		int num=100;
		int a=num/0;
		System.out.println(a);

		}
		catch (ArithmeticException e1) {
			
			System.out.println(e1);

			
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			
			System.out.println(e2);

			
		}
						
		catch (Exception e3) {
			
			System.out.println(e3);
	
		}
		
		finally {
			
			System.out.println("java prog");	
		}
		System.out.println("Welcome");
	
	}


}
