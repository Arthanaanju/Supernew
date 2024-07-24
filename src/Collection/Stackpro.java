package Collection;
import java.util.Stack;
import java.util.Vector;

public class Stackpro {
public static void main(String[] args) {

Stack li =new Stack();
li.push("Anu");
li.push("Achu");
li.push(20);
li.push("java");

		System.out.println("Disply elements="+li);
		
		li.push("Shilu");
		System.out.println("Disply elements="+li);

		li.pop();
		System.out.println("Disply elements="+li);

		li.peek();
		System.out.println("Disply peek elements="+li);

		
	}

}
