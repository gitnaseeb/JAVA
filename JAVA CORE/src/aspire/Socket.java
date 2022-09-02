package aspire;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Socket {
ServerSocket server;
public Socket() throws Exception{
	server=new ServerSocket(7860);
	while(true){//to create server
	System.out.println("server is ready");
	java.net.Socket client= server.accept();//for client
	System.out.println(client);
	 
	PrintWriter out=new PrintWriter(client.getOutputStream(),true); //true to flash the old buffer
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//system.in is like scanner reader to write input by user
	System.out.println("type your message for client");
	String msgToClient=in.readLine();
	out.print(msgToClient);
	
	
	}
}
public static void main(String[]args)throws Exception{
	new Socket();
}
}
