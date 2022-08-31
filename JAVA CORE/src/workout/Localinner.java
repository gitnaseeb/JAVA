package workout;

public class Localinner {

	public static void main(String[] args) {
	Localinner obj=new Localinner();
	obj.met();
	}
void met() {

	class localinner{		
		void met() {
			System.out.println("met of local inner");		
		
		}		
	}
	localinner obj1=new localinner();
	obj1.met();
	}
}
