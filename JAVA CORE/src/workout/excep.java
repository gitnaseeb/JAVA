package workout;

public class excep {

	public static void main(String[] args)throws CloneNotSupportedException {
	System.out.println("before");
	new excep().met();

	}
void met()throws CloneNotSupportedException {
	try {
		super.clone();
	}
	catch(CloneNotSupportedException e) {
		System.out.println(e);
		
	}
	super.clone();
}

}
