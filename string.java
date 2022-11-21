package userinput;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=sc.nextInt();
		String names[]=new String[length];
        System.out.println("enter the value");
        for(int i=0; i<names.length;i++){
        	names[i]=sc.next();
        }
        
        for(int i=0;i<names.length;i++){
       
        	System.out.println(names[i]);
        }
        
	}

}
