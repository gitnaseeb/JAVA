package aspire;
import java.util.HashSet;
import java.util.Set;
public class collection {
public static void main(String[]args) {
	Set<String> myset= new HashSet<String>();
	
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
