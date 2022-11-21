package stringmethod;
import java.util.Scanner;
public class stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		String value=new String(" SAVITA");
		String value1=new String("savita");
		System.out.println(value.concat("Devi"));
		System.out.println(value.substring(2));
		System.out.println(value.substring(2,4));
		System.out.println(value.replace('V','R'));
		System.out.println(value.toLowerCase());
		System.out.println(value.trim());
		System.out.println(value.substring(2));
		System.out.println(value1.toUpperCase());
		System.out.println(value1.indexOf('y'));
		System.out.println(value1.indexOf('v'));
		System.out.println(value1.isEmpty());
		System.out.println(value1.equalsIgnoreCase("savita"));
		System.out.println(value1.equalsIgnoreCase("python"));
		System.out.println(value1.equals("savita"));
		
		
		
		
		
		
		

	}

}
