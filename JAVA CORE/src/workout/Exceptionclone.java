package workout;

public class Exceptionclone {

	public static void main(String[] args)throws  CloneNotSupportedException{
		System.out.println("before");
		new Exceptionclone().met();
		System.out.println("afterr");
		

	}
   void met()throws CloneNotSupportedException {
	   try {
		   super.clone();
	   }catch(CloneNotSupportedException e) {
		   System.out.println(e);
		   
	   }
	   super.clone();
   }
  
   
}
//throws are like giving warning for error will occur 
//super.clone is for like parent method calling
