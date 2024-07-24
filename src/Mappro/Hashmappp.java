package Mappro;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Hashmappp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		
		mp.put(4, "java");
		mp.put(6, "welcome");
		mp.put(5, "Anu");

		System.out.println(mp);
		System.out.println("Random access="+mp.get(4));
		
		Set li=mp.entrySet();
		Iterator itr =li.iterator();
while(itr.hasNext()) {
	map.Entry entry =(Map.Entry)itr.next();
	System.out.println(entry.getKey()+":"+entry.getValue());

	
}
		
	}

}
