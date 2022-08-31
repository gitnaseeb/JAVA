package aspire;


import java.io.FileWriter;
import java.io.FileReader;

public class IO5 {

	public static void main(String[] args)throws Exception {
		FileReader fis = new FileReader("iofile.txt");
		FileWriter fos= new FileWriter("copy.2");
		try                   //try resources
		( fis;fos             //close method it will close automatically
				){
			int c=0;
			char b[]=new char[8];
			while((c=fis.read(b))!=-1) {
				fos.write(b,0,c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//it is a character reader / writer stream
}
