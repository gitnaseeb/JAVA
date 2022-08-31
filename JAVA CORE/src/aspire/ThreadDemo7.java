package aspire;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		AdmissionHall ah =new AdmissionHall();
		es.execute(()->{
			Thread.currentThread().setName("sam");
			ah.t1.table1();
			ah.t2.table2();
			ah.t3.table3();
		});
		es.execute(()->{
			Thread.currentThread().setName("rocky");
			ah.t1.table1();
			ah.t2.table2();
			ah.t3.table3();
		});
	
es.shutdown();
	}

} class AdmissionHall{
	Table1 t1=new Table1();
	Table2 t2 =new Table2();
	Table3 t3=new Table3();
	
}
 class Table1{
	synchronized  public static void table1() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" "+"occupied table 1....");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" "+"left the table 1..");
	}
	
}
  class Table2{
	  synchronized   public static void table2() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" "+"occupied table 2....");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" "+"left the table ..");
	}
	
}
  class Table3{
	  synchronized   public void table3() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" "+"occupied table 3....");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" "+"left the table 3..");
	}
}
