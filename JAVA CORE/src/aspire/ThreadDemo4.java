package aspire;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadDemo4 {

	public static void main(String[] args)throws Exception {
		System.out.println("main thread is teaching..");
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->new Worker1().eatBreakfast());
		//es.execute(()->new Worker2().payBill());
		Future<String>future=es.submit(()->{try {Thread.sleep(2000);}catch(Exception e) {}
		return new Worker2().payBill();});
		String str=future.get();
		System.out.println(str);
		es.shutdown();
		System.out.println("still teaching");
		}
	}


class Worker1{
	public void eatBreakfast() {
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("break fast....");
	}
}
class Worker2 {
	public String payBill() {
		return"Bill payed sir..";
	}
	
}
class MyCallable implements Callable <String>{
	public String call()throws Exception{
		try {}catch(Exception e) {}
		return new Worker2().payBill();
	}
}