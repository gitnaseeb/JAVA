package workout;

public class Static1 {

	public static void main(String[] args) {
	Outer1.inner obj =new Outer1.inner();
	obj.met();
	Outer1.nonstatic obj1=new Outer1().new nonstatic();
	obj1.met();
	
	}

}
class Outer1{
	static int i=20;
	void met1() {
		System.out.println("outer");
	}
	 static class inner{
		void met() {
			System.out.println("inner" + i);
		}
	}
	class nonstatic{
		int i=1000;
		void met() {
			System.out.println("non static"  +this.i);
		}
	}
	
}
//this keyword means if we use two class in that you need to specify this keyword to specify the
//instance classs 
