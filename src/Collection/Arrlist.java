package Collection;
import java.util.*;

public class Arrlist {
public static void main(String[] args) {

	List li=new ArrayList();
	
	//ArrayList li=new ArrayList();

	li.add("Anu");
	li.add("achu");
	li.add("java");
	li.add(113);

	System.out.println("Display LI=:"+li);
	
	List li1=new ArrayList();
	li.add(li);
	System.out.println("Display LI=:"+li1);

	li.remove(2);
	System.out.println(" LI=:"+li);

	
	System.out.println(" LI=:"+li);
li1.clear();
System.out.println(li);


li.add("manu");

System.out.println("all data");
for(int i=0;i<li.size();i++) {
System.out.println(li.get(i));

	
}
	}

}
