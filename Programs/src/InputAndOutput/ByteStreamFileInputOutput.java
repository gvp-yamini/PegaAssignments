package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		FileOutputStream out1 = null;
		try{
			in = new FileInputStream("C:/yaminiDrive/input.txt"); 
			out = new FileOutputStream("C:/yaminiDrive/output.txt");
			out1 = new FileOutputStream("C:/yaminiDrive/output1.txt",true);
			int c;
			while((c=in.read())!=-1){
				out.write(c);
				out1.write(c);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out !=null){
				
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
          if(out1 !=null){
				
				try {
					out1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
