package workout;

public class ExceptionTry {

	public static void main(String[] args) {
		System.out.println("before");
		try {
			int i =1/0;
	}
		catch( Exception e) {
		System.out.println(e);
		System.out.println("after");
	}
		
	
	finally {
		System.out.println("finalyl");
	}
}
}