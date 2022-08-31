package aspire;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class mapcol {

	public static void main(String[] args) {
		//HashMap<String , String> hmap=new HashMap<String,String>();
		TreeMap<String , String> hmap=new TreeMap<String,String>((s1,s2)->{return s1.compareTo(s2);});//in tree map its guarntie tht will in order
		hmap.put("a1", "hii");
		hmap.put("a2", "hello");
		hmap.put("a4", "hola");
		hmap.put("a3", "hey");
		System.out.println(hmap);
		System.out.println(hmap.get("a2"));
		Set<Map.Entry<String, String>> set =hmap.entrySet();//to create iterator
		Iterator<Map.Entry<String, String>> iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> me=iter.next();
			System.out.println(me.getKey()+" :" + me.getValue());
		}
		  
			 
		 }
		 
	}


