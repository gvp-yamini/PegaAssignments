package multiThreading;

public class ThreadByExtendingThreadClass extends Thread{

	/**
	 * @param args
	 */
	public void run(){
		System.out.println("Running....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadByExtendingThreadClass ob = new ThreadByExtendingThreadClass();
		ob.start();
	}

}
