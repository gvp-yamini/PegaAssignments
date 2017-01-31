class ParentP3{
	void msg() throws Exception{
		System.out.println("Parent");
	}
}
public class ChildWithSubClassException extends ParentP3{

	/**
	 * @param args
	 */
	void msg() throws ArithmeticException{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ParentP3 p = new ChildWithSubClassException();
       try{
    	   p.msg();
       }catch(Exception e){
    	   
       }
	}

}
