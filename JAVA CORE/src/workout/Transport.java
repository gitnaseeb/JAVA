package workout;

public class Transport {
 String a = "truck";
 void truck () {
	 System.out.println("king of road");
 }

	public static void main(String[] args) {
	airlines obj = new airlines();
	obj.truck();
	obj.plane();


	
	}
}

class ship extends Transport{
	String b="ship";
	void cargoship() {
		System.out.println("king of sea"  +a);
	}
	
}
class airlines extends ship{
	String c="aeroplane";
	void plane() {
		System.out.println("king of sky"  +c);
	}
		
}
