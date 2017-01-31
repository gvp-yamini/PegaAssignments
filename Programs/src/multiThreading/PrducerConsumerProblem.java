package multiThreading;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable{
	private final List<Integer> resourceQueue;
	private final int MAX_CAPACITY;
	
	Producer(List<Integer> sharedQueue,int size){
		resourceQueue = sharedQueue;
		MAX_CAPACITY = size;
	}
	public void run(){
		int counter=0;
		while(true){
			try{
				produce(counter++);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	private void produce(int count) throws InterruptedException{
		synchronized(resourceQueue){
			while(resourceQueue.size()==MAX_CAPACITY){
				System.out.println("Queue is full");
				resourceQueue.wait();		
			}
			Thread.sleep(100);
			resourceQueue.add(count);
			System.out.println("Produced :"+count);
			resourceQueue.notifyAll();
 		}
	}
}
class Consumer implements Runnable{
	private final List<Integer> resourceQueue;
	Consumer(List<Integer> sharedQueue){
		resourceQueue = sharedQueue;
	}
	public void run(){
		while(true){
			try{
				consume();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	private void consume() throws InterruptedException{
		synchronized(resourceQueue){
			while(resourceQueue.isEmpty()){
				System.out.println("Queue is empty");
				resourceQueue.wait();
			}
		}
		Thread.sleep(100);
		int i = (Integer)resourceQueue.remove(0);
		System.out.println("Consumed: "+i);
		resourceQueue.notifyAll();
	}
}

public class PrducerConsumerProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> taskQueue = new ArrayList<Integer>();
	      int MAX_CAPACITY = 5;
	      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
	      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
	      tProducer.start();
	      tConsumer.start();
	}

}
