package turnryoperator;
import java.util.Scanner;


public class turnry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println((num1<num2)?num1:num2);

	}

}
