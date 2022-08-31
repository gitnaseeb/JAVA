package aspire;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.net.URLConnection;
import java.net.URL;
import java.io.InputStreamReader;

public class IO8 {

	public static void main(String[] args) throws Exception{
		URL url=new URL("http://google.com/index.html");
		URLConnection urlcon=url.openConnection();
		
	BufferedReader bis=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
	FileWriter fis= new FileWriter("googel3.html");
	char b[]=new char[8];
	int c=0;
	while((c=bis.read(b))!=-1) {
		String str=new String(b,0,c);
		System.out.println(str);
		fis.write(b,0,c);
		
	}fis.close();
	}

}
