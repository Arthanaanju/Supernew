package Collection;
import java.util.*;

public class Vectorlistpro {
public static void main(String[] args) {

	List<Integer> li=new Vector();
	
	//ArrayList li=new ArrayList();

	li.add(20);
	li.add(30);
	li.add(40);
	li.add(70);

	System.out.println("Display LI=:"+li);
	
	List<Integer> li1=new Vector<Integer>();
	li.addAll(li);
	System.out.println("Display LI=:"+li1);

	li.remove(2);
	System.out.println(" LI=:"+li);

	
	System.out.println(" LI=:"+li);
li1.clear();
System.out.println(li);


li.add(80);

System.out.println("all data");


int i=0;
while(i<li.size()) {
i++;
System.out.println(li.get(i));

	
}
	}

}
