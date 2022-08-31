package workout;

public class StaticDemo {
static void mymet() {
	System.out.println("my met is called ....");
}
		void mymet1() {
			System.out.println("non static called");
		}
	


public static void main(String[]args) {
	mymet();
	StaticDemo obj=new StaticDemo();
	obj.mymet1();
			
}
}
//static is used to create a space in memory
//no need to create object when static is decarled 
//obj = is reference of variable 