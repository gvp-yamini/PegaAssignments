package multiThreading;

class Table{
	public synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void printTableSynchronisedBlock(int n){
		synchronized(this){
		for(int i=1;i<=5;i++){
			
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run(){
		//t.printTable(5);
		//System.out.println("-->");
		t.printTableSynchronisedBlock(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run(){
		//t.printTable(10);
		//System.out.println("<--");
		t.printTableSynchronisedBlock(10);
	}
}
public class ObjectLevelLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}

}
