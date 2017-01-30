
public class ThrowsClause {

	/**
	 * @param args
	 */
	static void throwMethod() throws NullPointerException{
		System.out.println("Inside throwMethod");
		throw new NullPointerException("yamini");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throwMethod();
		}catch(NullPointerException e){
			e.printStackTrace();
		}

	}

}
