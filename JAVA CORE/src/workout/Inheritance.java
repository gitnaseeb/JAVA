package workout;

public class Inheritance {
int x=10;
int y=20;
void met() {
	System.out.println("met called");
}

	public static void main(String[] args) {
	Inheritance obj=new Inheritance();
	obj.met();
     inheri heri = new inheri();
     heri.met1();
	}

}
class inheri extends Inheritance{
	int z=30;
	void met1() {
		System.out.println(x+y);
	}
}
//to reuse attributes and methods of an existing class when you create a new class 
//parent class cannot access the child class
//child class can access parent class
//simple inheritance;