
public class UserDefinedRuntimeExceptions {

	private int id;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int testId = 6;
         UserDefinedRuntimeExceptions ob = new UserDefinedRuntimeExceptions();
         ob.setIDNumder(testId);
	}
	
	public void setIDNumder(int id){
		if(id>5){
			throw new NoSuchIdIsAllowed("No such Id is allowed");
		}else{
		this.id = id;
		}
	}

}

class NoSuchIdIsAllowed extends RuntimeException{
	private String str1;
	NoSuchIdIsAllowed(String msg){
	  str1 = msg;
	}
	public String toString(){
		return (str1);
	}
}
