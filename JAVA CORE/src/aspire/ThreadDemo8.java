package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo8 {

	public static void main(String[] args) {
		ExecutorService es= Executors.newFixedThreadPool(2);
		Gun bofors=new Gun();
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			for(int i=0;i<5;i++) {
				bofors.loadGun();
			}
		});
		es.execute(()->{
			Thread.currentThread().setName("sam");
			for(int i=0;i<5;i++) {
				bofors.shootGun();
			}
		});
	es.shutdown();
	}

}
class Gun{
	boolean flag;
	synchronized public void loadGun() {
		if(flag) {
			try {wait();}catch(Exception e) {}
         
		}
		System.out.println("fill the gun....");
		flag=true;
		notify();
	}
	synchronized public void shootGun() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("shoot the gun....");
		flag=false;
		notify();
	}
}