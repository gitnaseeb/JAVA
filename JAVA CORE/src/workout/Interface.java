package workout;

public class Interface {

	public static void main(String[] args) {
		Alopathy obj =new Alopathy();
		obj.docure();
		unani obj1 = new unani();
		obj1.docure();
	}

}
interface Medicalstudy{
	void docure();
	
}
class Alopathy implements Medicalstudy{
	public void docure() {
		System.out.println("alopathy");
	}
}
class unani implements Medicalstudy{
	public void docure() {
		System.out.println("unani");
	}
}
//interfcae is like abstract
//here implements keyword is used for inherit
//in main class method will be empty it declared in subclasses

	