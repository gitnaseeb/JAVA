package aspire;
public class Lambda2 {

	public static void main(String[] args) {
	Andriod an=()->{System.out.println("andriod ");};
	an.os();
Apple ap=new Apple();
ap.os();
	}

}
interface Andriod{
	 void os() ;
		 
	 
}
class Apple implements Andriod{
	@Override
	public  void os() {
		System.out.println("ios");
	}
	
}