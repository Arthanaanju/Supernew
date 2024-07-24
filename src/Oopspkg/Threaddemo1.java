package Oopspkg;

class ThreadNew extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("New thread");
	}
}
}
public class Threaddemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadNew t=new ThreadNew();
		t.start();
		for(int i=1;i<=5;i++) {
		System.out.println("Main thread");
		
		
		}	
	}

}
