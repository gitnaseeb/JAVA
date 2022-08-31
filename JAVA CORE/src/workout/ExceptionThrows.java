package workout;

public class ExceptionThrows {

	public static void main(String[] args) throws Number10Exception{
		System.out.println("before");
       new ExceptionThrows().met(10);
	}
	void met(int i) throws Number10Exception{
		if(i==10) {
			 new Number10Exception();
		}
		else {
			System.out.println("not an error");
		}
	}
}
class Number10Exception extends Exception{
		
	}

