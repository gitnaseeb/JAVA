package aspire;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class IO1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("iofile.txt");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		try(
			fis;fos	
				){
			System.out.println((char)fis.read()); 
			System.out.println((char)fis.read()); 
			System.out.println((char)fis.read()); //end of the file is always represented by -1
		}catch(Exception e)
		{
					e.printStackTrace();
		}		
	}

}
//try with resources - when you use resources in a try block , the close method is called automatically