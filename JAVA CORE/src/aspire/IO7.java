package aspire;

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class IO7 {

	public static void main(String[] args) throws Exception {
		URL url =new URL("http://google.com/index.html");
		URLConnection urlcon=url.openConnection();
		BufferedReader bis =new BufferedReader(new InputStreamReader(urlcon.getInputStream())); //reading file
		FileWriter fos= new FileWriter("google2.html"); //creating file
		char b[]=new char[8];
		int c=0;
		while((c=bis.read(b))!=-1) {
			String str=new String(b,0,c);
			System.out.println(str);
			fos.write(b,0,c);
		}fos.close();
	}

}
//buffer reader 
//file readed by network