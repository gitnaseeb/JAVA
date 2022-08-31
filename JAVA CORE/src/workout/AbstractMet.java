package workout;

public class AbstractMet {

	public static void main(String[] args) {
		Dominopizza pizza=new indianpizza();
		pizza.makepizza();
	
	}

}
abstract class Dominopizza {
	final private void makedough() {
		System.out.println("making dough...");
	}
	final private void addingredients() {
		System.out.println("adding indgredients");
	}
	final public void makepizza() {
		makedough();
		addingredients();
		System.out.println("pizaa ready...");
	}
	abstract public void deliverpizza();
}
class indianpizza extends Dominopizza{
	@Override
	public void deliverpizza() {
		System.out.println("delievrinng");
	}
	
}
