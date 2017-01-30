
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1,num2;
      try{
    	  num1=0;
    	  num2=62/num1;
    	  System.out.println("Last statement in try block");
      }catch(ArithmeticException e){
    	  System.out.println("Error: Don't divide a number by Zero");
      }
      System.out.println("out of catch");
	}

}
