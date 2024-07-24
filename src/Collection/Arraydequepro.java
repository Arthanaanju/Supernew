package Collection;
import java.util.PriorityQueue;
import java.util.ArrayDequeue;

public class Arraydequepro {

	public static void main(String[] args) {

		ArrayDequeue <String>li=new PriorityQueue<String>();
		
		li.add("Hello");
		li.add("acd");
		li.add("good");
		li.add("welcome");

		for(String data: li) {
			System.out.println(data);
		}
		
		li.addFirst("java");
		li.addLast("moni");

		System.out.println(li);

		
		li.poll();
		System.out.println(li);

		li.pollFirst();
		System.out.println(li);

		li.pollLast();
		System.out.println(li);

		System.out.println(li.peek());
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());

		
	}

}
