package aspire;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
public class t3 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		met2();
		met3();
		//String name=setName();
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(()->t4.met4());

	}
public static void met2() {
	System.out.println("before");
}
public static void met3() {
	System.out.println("after");
}
}
class t4{
	public static void met4() {
		
		System.out.println("hii");
	}
} 