package aspire;
public class thread {
 public static void main(String[]args) {
	Thread t= Thread.currentThread();//main thread or lifeline thread
	System.out.println(t);//
	met1();
	met2();
	met3();
 }
 static void met1() {
	 System.out.println("met 1...called");
 }
public static void met2() {
	 System.out.println("met2....called");
	 try {Thread.sleep(3000);}
	 catch(Exception e) {}
	 System.out.println("met 3 waiting");
	 
	 }
 static void met3() {
	 System.out.println("met3 ....called");
 }
}
