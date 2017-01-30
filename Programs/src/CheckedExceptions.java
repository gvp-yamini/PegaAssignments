import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CheckedExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FileInputStream fs= null;
       try {
		fs = new FileInputStream("C:/yaminiDrive/sample.txt");
		int k;
		while((k=fs.read())!=-1){
			System.out.print((char )k + " ");
		}
		fs.close();
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(fs != null){
	    try{
	    	fs.close();
	    }catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		}
	}

}
