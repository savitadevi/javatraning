package arryinput;
import java.util.Scanner;

public class arryinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner (System.in);
	System.out.println("array");
	int n =sc.nextInt();
	int[] myarray=new int[n];
	System.out.println("eneter arrye lements");
	for(int i=0;i<n;i++) {
		myarray[i]=sc.nextInt();
	
	}

	System.out.print("array values");
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=myarray[i];
	}
	System.out.print("\n sum of array is"+sum);
		}
	
	}
