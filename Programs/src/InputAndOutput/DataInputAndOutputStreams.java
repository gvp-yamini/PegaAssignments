package InputAndOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputAndOutputStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			DataOutputStream dataOutputStream =new DataOutputStream(
			                    new FileOutputStream("C:/yaminiDrive/input.bin"));
			try {
				dataOutputStream.writeInt(123);
				dataOutputStream.writeFloat(123.45F);
		        dataOutputStream.writeLong(789);

		        dataOutputStream.close();
		      
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        

		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
