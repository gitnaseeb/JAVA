package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {

	public static void main(String[] args) {
		ExecutorService es =Executors.newFixedThreadPool(2);
		building lic=new building();
		building lic2=new building();
		es.execute(()->{
			Thread.currentThread().setName("captain");
			synchronized(building.class) {
				building.sulab.useToilet();
				//lic.mr.useManagerRoom();
			}
		
		});
		es.execute(()->{
			Thread.currentThread().setName("Vice cap");
			synchronized(building.class) {
				//building.sulab.useToilet();
				lic2.mr.useManagerRoom();
			}
		
		});
		es.shutdown();
		
	

	}

}
class building{
	static RestRoom sulab = new RestRoom();
	static ManagerRoom mr = new ManagerRoom();
	
}
class RestRoom{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name =t.getName();
		System.out.println(name+" " +"inside the toilet...");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+"  " +"left the toilet");
	}
	
}
class ManagerRoom{
	public void useManagerRoom() {
		Thread t=Thread.currentThread();
		String name =t.getName();
		System.out.println(name+" "+"inside the toilet...");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" "+"left the toilet");
	}
	
	
}
