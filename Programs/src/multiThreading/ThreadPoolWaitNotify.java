package multiThreading;

import java.util.ArrayList;
import java.util.List;

class ThreadPoolY{
	List<Task> list = new ArrayList<Task>();
	ThreadPoolY(){
		
	}
	
	public Task getTask(){
		Task con = null;
		try{
			 synchronized(list){
				 while(list.isEmpty()){
					 list.wait();
				 }
				 return list.remove(0);
			 }
		}catch(InterruptedException e){
			
		}
		return con;
	}
	
   public void addTask(Task task){
	   try{
		   synchronized(list){
			   list.add(task);
			   list.notifyAll();
		   }
	   }catch(Exception e){
		   e.printStackTrace();
	   }
   }
	
}
class Task implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("printed number is"+ i + "By thread named :"+Thread.currentThread().getName());
		}
	}
}

public class ThreadPoolWaitNotify implements Runnable{
	ThreadPoolY tp = new ThreadPoolY();
	Task t = null;
	public void run(){
		try{
		t = tp.getTask();
		t.run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolWaitNotify pool = new ThreadPoolWaitNotify();
		for(int i=0;i<=5;i++){
			Thread td = new Thread();
			td.start();
		}
	}

}
