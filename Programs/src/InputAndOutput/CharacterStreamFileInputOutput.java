package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamFileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		try{
			in = new FileReader("C:/yaminiDrive/input.txt"); 
			out = new FileWriter("C:/yaminiDrive/output.txt");
			int c;
			while((c=in.read())!=-1){
				out.write(c);
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
		}

	}

}
