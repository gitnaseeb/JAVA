package workout;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("bfore");
		try {
			int i =1/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
	
	catch(NumberFormatException ne) {
		System.out.println(ne);
	}
System.out.println("after");
}
	
}
//exception is like a package it has All exception package 
//in method can declare the exceptions like try catch, thow, throws