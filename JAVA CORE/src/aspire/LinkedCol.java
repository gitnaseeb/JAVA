package aspire;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;
import java.util.*;

//this program same as use in linkedlist,vector

public class LinkedCol {

	public static void main(String[] args) {
	List<String> mylist= new ArrayList<String>();
	//for vector collection
	//Vector<String> mylist= new Vector<String>();
	mylist.add("hey");
	mylist.add("hello");
	mylist.add("hola");
	mylist.add("hii");
	System.out.println(mylist);
	System.out.println(mylist.get(2));
	mylist.remove(3);
	System.out.println(mylist);
System.out.println(mylist.contains("oye"));//its show the elements are available or not in list
Collections.sort(mylist);
System.out.println(mylist);//its use to sort in ascending order
mylist.sort(new MyComparator());//comparator is a interface 
mylist.sort((s1,s2)->{return s2.compareTo(s1);});//in lambda & is use to compare ascending to descending
	System.out.println(mylist);
	for( int i=0;i<mylist.size();i++) { //for loop to read one by one
	System.out.println(mylist.get(i));
		for(String s:mylist) {  //enchaned for loop
			System.out.println(s);
			Iterator<String> iter=mylist.iterator(); //its a field fast temporary object like index & this will be faster for reading & one time only can read iterator
			while(iter.hasNext()) {//it returns a boolean is next there or not 
				System.out.println(iter.next());//this will fetch the data from the collection
				
			}
			System.out.println("+++++++++++");  //once you given iterator you cannot modify 
			iter=mylist.iterator();               
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			System.out.println("-----------------");
			ListIterator<String> Iter=mylist.listIterator()	;
			while(Iter.hasNext()) {
				System.out.println(Iter.next());
			}
			while(Iter.hasPrevious()) {
				System.out.println(Iter.previous());
			}
			//only for vector
			//Enumeration <String> en = mylist.elements();    //after enumeration we can add or modify vector only supports this 
			//while(en.hasMoreElemenent()){                   //mylist.add("kkkkkkk")
			//syso(en.nextElement());}
			
			
		}
		
	}
	}

}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1 , String o2) {
		return 0;									//compareto is return 1 or -1 or 0
	}
}