package Controlstatement;

import java.util.Scanner;

public class Switchstate_withscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";

		switch (browser) {

		case "safari":System.out.println("safari browser");
		break;

		case "jira":System.out.println("jira browser");
		break;

		case "chrome":System.out.println("chrome browser");
		break;

		default:System.out.println("not supported browser");
		}
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a day:");
		String day=scan.next();
		switch (day) {
		
		case "mon": System.out.println("mon");
		break;

		case "tue":System.out.println("tue");
		break;

		case "wed":System.out.println("wed");
		break;

		default:System.out.println("not supported");
		break;
		}


		System.out.println("Enter a day="+day);
		
				
			

		

	}

}
