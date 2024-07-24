package Thiskeyword;

public class Polymor {
public void add() {
	
	int a,b,c;
	a=10;
	b=20;
	c=a+b;
	
	System.out.println("Sum="+c);
}
public void add(int a,int b) {
	
	System.out.println(a+b);

}
public void add(int a,float b) {
	System.out.println(a+b);
}

public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Polymor ob=new Polymor();
		ob.add(7,6,8);
		ob.add(7,6.7f);
		ob.add(7,6);

		
		
	}

}
