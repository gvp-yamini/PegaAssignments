class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1 = str2;
	}
	public String toString(){
		return (str1);
	}
}
public class UserDefinedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
        	throw new MyException("yamini customised exception");
        }catch(MyException e){
        	System.out.println("my Catch");
        	System.out.println(e);
        }
	}

}
