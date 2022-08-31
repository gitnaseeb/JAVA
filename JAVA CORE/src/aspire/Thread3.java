package aspire;
public class Thread3 {

	public static void main(String[] args) {
		new Thread3();
		System.out.println("main thread...");

	}
	public Thread3() {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}


class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("job of child thread is written here ...");}
	}
}