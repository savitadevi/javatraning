package exception;

public class UserdefinedException extends Exception {

    int data;
    UserdefinedException(int data1){
    	data=data1;
    }
    public void myexception() {
    	System.out.println(data);
    }

}
