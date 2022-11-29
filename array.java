package array;
import java.util.Scanner;

public class array {
	public static void fun(int[]arr) {
		arr[2]=30;
		arr[3]=40;
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[4]=30;
		fun(arr);
		
			
		}
		

	}


