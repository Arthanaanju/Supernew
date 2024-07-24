package LoopStatement;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [][]= new int [3][3];

arr[0][0]=100;
arr[0][1]=500;
arr[0][2]=600;

arr[1][0]=10;
arr[1][1]=20;
arr[1][2]=30;

arr[2][0]=150;
arr[2][1]=160;
arr[2][2]=170;

for (int i =0;i<3;i++) {
	for (int j=0;j<3;j++) {
		
		System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
	
}

		
		
		
	}

}
