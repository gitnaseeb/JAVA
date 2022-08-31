package aspire;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO4 {

	public static void main(String[] args)  throws Exception{
		FileInputStream fis =new FileInputStream("iofile.txt");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		FileOutputStream fos1 = new FileOutputStream("copy1.txt",true);//true - will append the file 
		try(
				fis;fos;fos1             //close method
				){
				int c=0;
				
				byte b[]=new byte[8];
				while((c=fis.read(b))!=-1){
					fos.write(b,0,c);
					fos1.write(b,0,c);
				}
			}catch(Exception e)
			{
						e.printStackTrace();
			}		
		}
	}
//to  create io file

