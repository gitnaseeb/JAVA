package aspire;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SocketClient {
   Socket client;
   public SocketClient()throws Exception{
	   while(true) {
	  client=new Socket("localhost",7860) ;
	  BufferedReader read=new BufferedReader(new InputStreamReader(client.getInputStream()));
	  String msgFromServer=read.readLine();
	  System.out.println("messeage from server :" +msgFromServer);
   }		  
   }
   public static void main(String[]args) throws Exception {
	   new SocketClient();
	   
   }
}
