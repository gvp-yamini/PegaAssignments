
public class FinallyWithReturn {

	/**
	 * @param args
	 */
	public static int myMethod(){
		try{
			return 0;
		}finally{
			System.out.println("inside finally");
			return 11;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(FinallyWithReturn.myMethod());
	}

}
