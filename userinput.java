package userinput;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("which operator do you want to do?");
		Scanner sc=new Scanner(System.in);
		String symbol=sc.next();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if (symbol.equalsIgnoreCase("addition")) {
			System.out.println(num1+num2);
			
		}
		else if (symbol.equalsIgnoreCase("division")) {
			System.out.println(num1%num2);
			
		}
		else if (symbol.equalsIgnoreCase("subtraction")) {
			System.out.println(num1-num2);
			
		}
		else if (symbol.equalsIgnoreCase("multyply")) {
			System.out.println(num1*num2);
			
		}
		
		
		

	}

}
