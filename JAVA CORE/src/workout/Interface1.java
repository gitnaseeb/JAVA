package workout;

public class Interface1 {

	public static void main(String[] args) {
	 IT obj =new IT();
	 obj.tech();
	 apps obj1=new apps();
	 obj1.tech();

	}

}
interface Computer{
	void tech();
}
class IT implements Computer{
	public void tech() {
		System.out.println("technologies");
	}
}
class apps implements Computer{
	public void tech() {
		System.out.println("application");
	}
}