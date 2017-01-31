package multiThreading;

class Count extends Thread{
	Count(){
		super("My Thread");
		System.out.println("created"+this);
		start();
	}
	
	public void run(){
		for(int i=0;i<10;i++){
		  System.out.println("count-->"+i);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("My thread run is over");
		}
	}
}

public class MainAndChildThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Count cnt = new Count();
        while(cnt.isAlive()){
        	System.out.println("Main thread is alive");
        	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        System.out.println("Main thread run is over");
	}

}
