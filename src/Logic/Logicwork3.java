package Logic;

public class Logicwork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=60,num2=50;
		boolean var1=num1<num2;
		boolean var2=num1>num2;
		
		System.out.println("answer="+!((var1||var2)&&(var1||var2)));
		
		
	}

}
