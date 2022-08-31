package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MultiThread {

	public static void main(String[] args) {
		//new MultiThread();
		System.out.println("main thread...");
		 new MultiThread();
	
	}
	public   MultiThread(){
		ExecutorService es = Executors.newFixedThreadPool(1);
		//es.execute(null);
		es.execute(()->{System.out.println("child thread logic...");});
		es.shutdown();
	}

}

