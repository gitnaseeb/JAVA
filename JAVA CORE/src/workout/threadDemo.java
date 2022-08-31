package workout;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadDemo {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		AdmissionHall thenewcollege = new AdmissionHall();
		es.execute(()->{
			Thread.currentThread().setName("Nax");
			thenewcollege.table1();
			thenewcollege.table2();
			thenewcollege.table3();
			
			
		});
		es.execute(()->{
			Thread.currentThread().setName("ALI");
			thenewcollege.table1();
			thenewcollege.table2();
			thenewcollege.table3();
			
			
		});
		es.shutdown();
	}

}
class AdmissionHall{
	synchronized public void table1() {
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println(name + "is inside the table1");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name +  "left the table 1");
	}
	synchronized public void table2() {
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println(name + "is inside the table2");
		try {wait(1000);}catch(Exception e) {}
		System.out.println(name +" "+"left the table 2");
	}
	 synchronized public void table3() {
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"is inside the table1");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+"left the table 1");}
	
}
