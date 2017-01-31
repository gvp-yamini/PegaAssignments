package multiThreading;
class Count1 implements Runnable{
	Thread mythread;
	Count1(){
		mythread = new Thread(this,"my runnable thread");
		System.out.println("My thread created"+mythread);
		mythread.start();
	}
	public void run(){
		try{
		for(int i=0;i<10;i++){
			System.out.println("count-->"+i);
			Thread.sleep(1000);
		}
	   }catch(InterruptedException e){
		   e.printStackTrace();
	   }
	}
}
public class MainAndChildThreadsRunnableInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Count1 cnt = new Count1();
       try{
    	   while(cnt.mythread.isAlive()){
    		   System.out.println("Main thread is alive");
    		   Thread.sleep(100);
    	   }
       }catch(InterruptedException e){
    	   e.printStackTrace();
       }
       System.out.println("Main thread is over");
	}

}
