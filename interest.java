package array;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] rat=new int[3];
		System.out.println("Enter principle,rate of interest and time");
	
		for(int i=0;i<3;i++) {
			rat[i]=sc.nextInt();
			
		}
		System.out.println("your simple interest is "+rat[0]*rat[1]*rat[2]/100);
		
		
		
		
		
				
		
				
		

	}

}
