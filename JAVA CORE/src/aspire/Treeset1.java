package aspire;
import java.util.HashSet;
import java.util.Set;

public class Treeset1 {

	public static void main(String[] args) {
	Set<Question> myset= new HashSet<Question>();
	//Set<Question> myset= new treeSet<Question>((q1,q2)->{return q2.compareTo(q1);});  for comparing in tree set 
	
	myset.add(new Question("who is cm1","stalin","kalingar","1"));
	myset.add(new Question("who is cm2","stalin","kalingar","1"));
	myset.add(new Question("who is cm3","stalin","kalingar","1"));
	System.out.println(myset);
	myset.add(new Question("who is cm4","stalin","kalingar","1"));
	System.out.println(myset);
	}
//this will not work in tree set because custom structure

	//we can do by implements comparable  then override compareto
	

}
class Question{
	 String question,o1,o2,ans;
	 public Question(String question,String o1 , String o2,String ans) {
		 this.question = question;
		 this.o1=o1;
		 this.o2=o2;
		 this.ans=ans;
		 
		 
	 }
	@Override
	public String toString() {
		return"Question [question="+ question +",o1="+o1+",o2=" +o2+",ans=" +ans+"]";
	}
}