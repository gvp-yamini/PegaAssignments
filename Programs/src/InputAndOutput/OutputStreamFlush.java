package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamFlush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
        try{
        	in = new FileInputStream("C:/yaminiDrive/input.txt"); 
			out = new FileOutputStream("C:/yaminiDrive/output.txt");
			
			
			//out.flush();
			out.write('B');
			out.write('A');
			
			System.out.println(" "+in.available());
        }catch(IOException e){
        	e.printStackTrace();
        }
	}

}
