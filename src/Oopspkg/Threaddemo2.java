package Oopspkg;

public class Threaddemo2 implements Runnable{

	public static void main(String[] args)throws InterruptdException {
for (int i=1;i<5;i++) {
	Threaddemo2 ob=new Threaddemo2();
	Thread t=new Thread(ob);
	t.start();
	t.sleep(1000);
	
}
public void run() {
	
	System.out.println("Currently working is:"+Thread.currentthread().getName()
);
		
		
	}

}
