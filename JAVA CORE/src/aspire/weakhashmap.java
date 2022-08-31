package aspire;
import java.util.Map;
//import java.util.HashMap;
import java.util.WeakHashMap;

public class weakhashmap {

	public static void main(String[] args) {
		Map<String,String> hmap=new WeakHashMap<String,String>();
		
		String a1=new String("a1");
		String a2=new  String("a2");
		String a3=new String("a3");
		
		hmap.put(a1, "aa");
		hmap.put(a2, "bb");
		hmap.put(a3, "cc");
		System.out.println(hmap);
		 a1=null;
		 System.gc();
		 System.out.println(hmap);
	}

}
