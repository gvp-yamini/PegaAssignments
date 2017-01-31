package multiThreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Worker implements Runnable{
	BlockingQueue<Integer> q = new LinkedBlockingQueue<
			Integer>();
	Worker next = null;
	
	public void setNext(Worker t){
		next = t;
	}
	public void accept(int i){
		q.add(i);
	}
	public void run(){
		while(true){
			try{
				int i = q.take();
				System.out.println(Thread.currentThread().getName() +" -> "+ i);
	            Thread.sleep(1000);
	            if(next != null){
	            	if(i<10){
	            	next.accept(i+1);
	            	}
	            }
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class SequenceNumbersWithAlternatingThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker();
		Worker w2 = new Worker();
        w1.setNext(w2);
        w2.setNext(w1);
        
        Thread t1 = new Thread(w1,"Thread1");
        Thread t2 = new Thread(w2,"Thread2");
        
        t1.start();
        t2.start();
        
        w1.accept(1);
	}

}