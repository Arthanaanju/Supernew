package Collection;
import java.util.*;

public class Linkedlistpor {
public static void main(String[] args) {

	List <String>li=new ArrayList();
	
	//ArrayList li=new ArrayList();

	li.add("Anu");
	li.add("achu");
	li.add("java");
	li.add("113");

	System.out.println("Display LI=:"+li);
	
	List  <String>li1=new ArrayList();
	li.addAll(li);
	System.out.println("Display LI=:"+li1);

	li.remove(2);
	System.out.println(" LI=:"+li);

	
	System.out.println(" LI=:"+li);
li1.clear();
System.out.println(li);


li.add("Anu");

System.out.println("all data");
for(int i=0;i<li.size();i++) {
System.out.println(li.get(i));

	
}
	}

}
