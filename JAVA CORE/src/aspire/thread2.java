package aspire;
public class thread2 {

	public static void main(String[] args) {
	met3();

	}
	static void met1() {
		System.out.println("met 1 called");
	}
	public static void met2(){
		System.out.println("met 2 called");
		try {Thread.sleep(3000);}
		catch(Exception e){}
			System.out.println("waiting");
		
	}
	static void met3()
	{
		System.out.println("met 3 called ");
	}
	

}
