package InputAndOutput;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriterFlush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Hello World";
        
        Writer writer = new PrintWriter(System.out);
        try{
        	writer.append(s);
        	writer.flush();
        	writer.append("Hi Yamini");
        	writer.close();
        }catch(IOException e){
        	e.printStackTrace();
        }
	}

}
