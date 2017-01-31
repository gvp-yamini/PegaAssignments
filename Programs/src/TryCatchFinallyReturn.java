
public class TryCatchFinallyReturn {

	/**
	 * @param args
	 */
	public static int foo(){
		try{
			int a = 1,b=0;
			a=a/b;
			System.out.println("Try");
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("catch");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(foo());
	}

}
