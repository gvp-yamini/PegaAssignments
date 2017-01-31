class ParentP1{
	void msg(){
		System.out.println("Parent");
	}
}
public class ChildUncheckedException extends ParentP1{

	/**
	 * @param args
	 */
	void msg() throws ArithmeticException{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ParentP1 p = new ChildUncheckedException();
        p.msg();
	}

}
