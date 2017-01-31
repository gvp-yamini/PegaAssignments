import java.io.FileInputStream;
import java.io.IOException;

class Parent5{
	void msg() throws IOException{
		System.out.println("Parent");
	};
}
public class subclassUncheckedExceptions extends Parent5{
  void msg() throws ArithmeticException{
	  System.out.println("child");
  }
  public static void main(String args[]){
	  Parent5 p = new subclassUncheckedExceptions();
	  try{
		  p.msg();
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
}
