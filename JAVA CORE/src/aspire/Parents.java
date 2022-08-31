package aspire;

public class Parents {
String a ="vehicle";
void met() {
	System.out.println(a);
}

public static void main(String[] args) {
		 Child s =new Child();
		 s.met1();
		 s.met();
	}

}
class Child extends Parents{
	String b="car";
	void met1() {
		System.out.println(b);
	}
	
}
class son extends Parents{
	String c ="bike";
	void met2() {
		System.out.println(c);
	}
}
//hierarical inheritance 
//one parent two different child
//child canot call another child in hierarchical its can call its parent class