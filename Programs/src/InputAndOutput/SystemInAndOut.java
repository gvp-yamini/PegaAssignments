package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInAndOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String line;
		try {
			line = in.readLine();
			System.out.println("You typed " + line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("failed");
			e.printStackTrace();
		}
	     
	}

}
