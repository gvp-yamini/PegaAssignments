import java.io.IOException;

class Parent{
	void msg() throws IOException{
		System.out.println("Parent");
	}
}
public class ParentClassWithNoException extends Parent{

	/**
	 * @param args
	 */
	void msg() throws IOException{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parent p = new ParentClassWithNoException();
      try {
		p.msg();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
