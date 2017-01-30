import java.io.FileInputStream;
import java.io.IOException;


public class TryCatchFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 FileInputStream fs= null;
	       try {
			fs = new FileInputStream("C:/yaminiDrive/sample.txt");
			int k;
			while((k=fs.read())!=-1){
				System.out.print((char )k + " ");
			}
			
		}finally{
			if(fs != null){
				fs.close();
			}
		}
	}

}
