package aspire;
import java.util.TreeSet;
import java.util.Set;
public class treeset {

	public static void main(String[] args) {
		
			Set<String> myset= new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
			
			myset.add("hello");
			myset.add("hii");
			myset.add("hey");
			myset.add("heloooo");
			System.out.println(myset);
			System.out.println(myset.size());
			myset.add("hola");
			System.out.println(myset);
			myset.remove("heloooo");
			System.out.println(myset);
			for(String s:myset) {
				System.out.println(s);
				
			}
			
			}

		


	}

