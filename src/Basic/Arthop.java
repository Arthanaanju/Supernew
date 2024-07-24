package Basic;

public class Arthop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=200,num2=50,num3=100,sum,mul,sub,mod;
float div;

sum=num1+num2+num3;
sub=num1-num2-num3;
mul=num1*num2*num3;
div=num1/num2/num3;
mod=num1%num2%num3;

int value= num1+num3/num1+(num3%num2)*(num3-num1);
System.out.println("value="+value);
		
		
	}

}
