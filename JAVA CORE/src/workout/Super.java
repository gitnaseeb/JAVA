package workout;

public class Super {
	void animalsound() {
		System.out.println("the animal make sounds");
	}

	public static void main(String[] args) {
		Super c = new kitten();
		c.animalsound();

	}

}
class kitten extends Super{
	void animalsound() {
		super.animalsound();
		System.out.println("the kitten say : meow meow");
	}
	
}
//super keyword is used to call parent call variable
//super keyword cant be used in static 
//the method name shld be same in child class method name 