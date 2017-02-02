package client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 */
	private static Socket socket;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String host = "localhost";
		 System.out.println("Please enter username");
		 Scanner scan = new Scanner(System.in);
		 String name = scan.nextLine();
		 scan.close();
	        int port = 8888;
	        try {
				InetAddress address = InetAddress.getByName(host);
				try {
					socket = new Socket(address,port);
					try {
						Thread.sleep(1000);
						Thread server = new Thread(new ServerThread(socket,"yamini"));
						server.start();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}catch(IOException e){
					e.printStackTrace();
				}finally{
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
