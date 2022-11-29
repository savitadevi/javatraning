package exception;

public class exeption {

	public static void main(String[] args)throws UserdefinedException {
		// TODO Auto-generated method stub
		
			try {
				throw new UserdefinedException(10);
				
			} 
			
			
			
			finally {
				System.out.println("i am in finaly block");
			}

	

	}}
