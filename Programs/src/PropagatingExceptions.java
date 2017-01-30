
public class PropagatingExceptions {
  void m(){
	  int data = 50/0;
  }
  void n(){
	  m();
  }
  void p(){
	  try{
		n();  
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropagatingExceptions ob = new PropagatingExceptions();
		ob.p();
		System.out.println(" normal flow");
	}

}
