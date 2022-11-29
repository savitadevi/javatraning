package thread;

public class thread extends Thread{
	
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		Thread t1=new Thread();
//		Thread t2=new Thread();
//		t1.start();
//		t2.start();
		
		
//	System.out.println(t2.getState());
//	System.out.println(t1.getState());
//	System.out.println(t1.isAlive());
//	System.out.println(t2.isAlive());
		
		thread t1=new thread();
		thread t2=new thread();
		thread t3=new thread();
		thread t4=new thread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.suspend();
		t1.resume();
		

		
////       
        }
        
        
	}


