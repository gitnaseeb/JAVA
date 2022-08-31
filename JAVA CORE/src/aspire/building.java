package aspire;
public class building {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		restroom1.usetoilet();
	}

}
class restroom1{
	public static void usetoilet() {
		System.out.println("  use this toilet");
	try {Thread.sleep(3000);}	catch(Exception e){}
	System.out.println("wait");
	}
	
}
