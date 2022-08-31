package workout;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo3 {
	public static void main (String[]args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		es.execute(()->{
			Thread.currentThread().setName("ITEM");
			Order.order();
			Dispatched.dispatched();
			Deliver.deliver();
		});
		es.shutdown();
		
	}

}
  class Order{
	 public static void order() {
		Thread t = Thread.currentThread();
		String name=t.getName();
		System.out.println( "your order in waiting");
		try {Thread.sleep(1000);}catch(Exception e) {}
	System.out.println("your order has palced");
}
}
  class Dispatched{
	 public static void dispatched() {
		Thread t = Thread.currentThread();
		String name=t.getName();
		System.out.println("your" +  " "+name +" " +"is waiting for dispatched");
		try {Thread.sleep(500);}catch(Exception e) {}
	System.out.println("your order has been dispatched");
}
}
  class  Deliver{
	
	  public static void deliver() {
		Thread t =Thread.currentThread();
		String name=t.getName();
		System.out.println("your" + " "+name+" " +"waiting for deliver");
		try {Thread.sleep(200);}catch(Exception e) {}
			System.out.println("your" + " "+name + " "+"delivered");
		
	}
}