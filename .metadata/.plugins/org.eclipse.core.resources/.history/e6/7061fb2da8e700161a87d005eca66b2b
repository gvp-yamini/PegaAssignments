package multiThreading;


public class ClassLevelLock {
	
	private volatile ClassLevelLock INSTANCE;
	
	private ClassLevelLock(){}
	
	public ClassLevelLock getInstance(){
		if(INSTANCE ==null){
			synchronized(ClassLevelLock.class){
				if(INSTANCE==null){
					INSTANCE = new ClassLevelLock();
				}
			}
		}
		return INSTANCE;
	}

}
