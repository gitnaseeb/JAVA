package aspire;

public class animal {
	//String a="domestic animals";
	void eat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
	cat c= new doge();
	c.eat();
	c.run();
	}

}
class cat extends animal{
	void run() {
		System.out.println("running");
	}
}
class doge extends cat{
	void bark(){
		System.out.println("barking");
	}
}//mutlilevel 
