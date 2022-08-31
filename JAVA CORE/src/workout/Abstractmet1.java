package workout;

public class Abstractmet1 {

	public static void main(String[] args) {
		starbuck buck=new indianbuck();
		buck.milkshake();
		buck.delivershake();
		buck.ingredients();
		buck.makeshake();
	}

}
abstract class starbuck{
	 void milkshake() {
		System.out.println("delicious milkshake");
	}
	 void ingredients() {
		System.out.println("add some milk, and some stuffs");
	}
	final public void makeshake() {
		
		  System.out.println("your milkshake is ready");
	}
	abstract public void delivershake();
		
}


class indianbuck extends starbuck{
	public void delivershake() {
		System.out.println("your shake will in 5 mins");
	
}
}
//when there is abstract class then it shld have abstract method
//abstract method does not hve body . it can call by inherited class 
//abstract is a common noun eg paint
//abstract is used to hide details and it show essential info to user
