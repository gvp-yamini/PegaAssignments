package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable{

	/**
	 * @param args
	 */
	private Socket socket;
	private String name;
	private PrintWriter out;
	private BufferedReader serverIn;
	private BufferedReader userIn;
	public ServerThread(Socket socket,String name){
		this.socket = socket;
		this.name = name;
	}
    public void run(){
    	try {
			out = new PrintWriter(socket.getOutputStream(),true);
			serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			userIn = new  BufferedReader(new InputStreamReader(System.in));		
    	    while(!socket.isClosed()){
    	    	if(serverIn.ready()){
    	    		String input = serverIn.readLine();
    	    		if(input != null){
    	    			System.out.println(input);
    	    		}
    	    	}
    	    	if(userIn.ready()){
    	    		out.println(name+" > "+userIn.readLine());
    	    	}
    	    }
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
