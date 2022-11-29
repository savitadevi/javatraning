package dimansional2;
import java.util.Scanner;

public class intigerdimensiol {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int column;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column");
		row=sc.nextInt();
		column=sc.nextInt();
		int[][]number=new int[row][column];
		System.out.println("enter the value of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				number[i][j]=sc.nextInt();
			}
		}
		System.out.println("my array is:");
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				System.out.print(number[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
