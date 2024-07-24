package Oopspkg;

public class Threadprooo {

	public static void main(String[] args) {

		Thread t=Thread.currentThread();
		System.out.println("Current therad is="+t);
		System.out.println("therad name is="+t.getName());

		
		t.setName("My Thread");
		System.out.println("After changing thread is ="+t);
		System.out.println("New therad name is="+t.getName());

		try {
			
			for (int n=5;n<=1;n--) {
					System.out.println(n);
					Thread.sleep(100);
			
		}
		}
		
		catch(Exception e) {
		
		System.out.println(e);
		}
	}

}
