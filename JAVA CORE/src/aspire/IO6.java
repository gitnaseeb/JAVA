package aspire;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
public class IO6 {

	public static void main(String[] args) throws Exception {
		URL url =new URL("http://google.com/index.html");
		URLConnection urlcon=url.openConnection();
		BufferedInputStream bis =new BufferedInputStream(urlcon.getInputStream()); //reading file
		FileOutputStream fos= new FileOutputStream("google.html"); //creating file
		byte b[]=new byte[8];
		int c=0;
		while((c=bis.read(b))!=-1) {
			String str=new String(b,0,c);
			System.out.println(str);
			fos.write(b,0,c);
		}fos.close();
	}

}
//buffer input stream