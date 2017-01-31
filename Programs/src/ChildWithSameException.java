class ParentP2{
	void msg() throws Exception{
		System.out.println("parent");
	}
}
public class ChildWithSameException extends ParentP2{

	/**
	 * @param args
	 */
	void msg() throws Exception{
		System.out.println("child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ParentP2 p = new ChildWithSameException();
       try{
    	  p.msg(); 
       }catch(Exception e){
    	   e.printStackTrace();
       }
	}

}
