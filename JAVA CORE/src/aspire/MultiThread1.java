package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MultiThread1 {
	public  MultiThread1() {
		ExecutorService es =Executors.newFixedThreadPool(1);
		es.execute(()->{System.out.println("child thread logic...");});
		es.shutdown();
		
	}
public static void main(String[]args) {
new MultiThread1();	
for(int i=0;i<=5;i++) {
	System.out.println("main thread.... "+i);
	try {Thread.sleep(3000);
}catch(Exception e) {
	System.out.println(e);}
}
}
}