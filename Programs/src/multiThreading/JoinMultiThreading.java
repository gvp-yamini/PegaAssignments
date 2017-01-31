package multiThreading;

public class JoinMultiThreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Thread t1 = new Thread(new MultiThread(),"t1");
         Thread t2 = new Thread(new MultiThread(),"t2");
         Thread t3 = new Thread(new MultiThread(),"t3");
         t1.start();
         try {
			t1.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         t2.start();
         try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t3.start();
        try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("only main thread is running");
	}

}

class MultiThread implements Runnable{
	public void run(){
		System.out.println("Thread stARTED name: "+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended name: "+Thread.currentThread().getName());
	}
}
