class ParentP4{
		void msg() throws Exception{
			System.out.println("Parent");
		}
	}
public class ChildWithNoException extends ParentP4 {
  
	/**
	 * @param args
	 */
	void msg(){
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ParentP4 p = new ChildWithNoException();
       try{
       p.msg();
       }catch(Exception e){
    	   
       }
	}

}
