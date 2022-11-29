package dimansional;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
         int[][]numbers= new int[4][2];
	    numbers[0][0]=2;
	    numbers[0][1]=4;
	    numbers[1][0]=6;
	    numbers[1][1]=9;
	    numbers[2][0]=4;
	    numbers[2][1]=9;
	    numbers[3][0]=4;
	    numbers[3][1]=9;
	    for(int i=0;i<4;i++) //row count
	    {
	    	for(int j=0;j<2;j++)//column count
	    	{
	    		System.out.print(numbers[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	
	}
}
