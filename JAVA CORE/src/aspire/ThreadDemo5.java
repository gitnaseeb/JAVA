package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {

	public static void main(String[] args) {
ExecutorService es= Executors.newFixedThreadPool(2);
ReservationCounter central=new ReservationCounter();
es.execute(()->{Thread.currentThread().setName("NAx");
synchronized(central) {
	central.bookTicket(1000);
	central.givechange();
}
});
es.execute(()->{Thread.currentThread().setName("nax");
	synchronized(central) {
		central.bookTicket(500);
		central.givechange();}
});
es.shutdown();
}


	}


class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"is waiting for the change");
		try {Thread.sleep(1000);}catch(Exception e) {}	
		System.out.println(name+"left with change...");
		}
	public void givechange() {
		Thread t=Thread.currentThread();
		String name =t.getName();
		System.out.println(name+"is waiting for the change...");
		try {Thread.sleep(1000);}catch(Exception e) {}	
	  System.out.println(name+"left with change.."+(amt-100));	
	}
}
