package aspire;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("iofile.txt");
		FileOutputStream fos = new FileOutputStream("copy");
		try(
			fis;fos	
			){
			int c=0;
			System.out.println("the size of the file is :"+fis.available());
			byte b[]=new byte[fis.available()];
			while((c=fis.read(b))!=-1){
				System.out.println("the number of character :"+c);
				String str= new String(b);
				System.out.println(str);
			}
		}catch(Exception e)
		{
					e.printStackTrace();
		}		
	}
	}
//another way to read io file

