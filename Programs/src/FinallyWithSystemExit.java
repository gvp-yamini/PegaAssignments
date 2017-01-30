
public class FinallyWithSystemExit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   System.out.println("try block");
    	   System.exit(0);
       }catch(Exception e){
    	   System.out.println(e);
       }finally{
    	   System.out.println("finally block");
       }
	}

}
