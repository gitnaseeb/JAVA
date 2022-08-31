package workout;

public class Excep1 {
	public static void main(String []args) {
		System.out.println("before");
		try {
			int i=1/10;
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("after");
		}
	}
}
