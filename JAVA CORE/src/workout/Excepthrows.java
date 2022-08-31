package workout;

public class Excepthrows {

	public static void main(String[] args)throws  NumberErrorException {
		System.out.println("before");
		new Excepthrows().met(23);
	}
	void met(int i)throws  NumberErrorException {
		if(i>15) {
			  throw new NumberErrorException();
		}
		else {
			System.out.println("nah its not an error");
		}
	}

}
class  NumberErrorException extends Exception{
	
}