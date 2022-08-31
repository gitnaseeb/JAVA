package aspire;
enum world{
	Asia("india"),America("LA"),Antartica("SNOW"),Europe("paris");
	world(String string){}
	String place;
		String getplace() {
		return place;
		
		
	}
	
}
public class enum3 {

	public static void main(String[] args) {
		System.out.println(world.America);
world wld =world.America;
if(world.valueOf("America")==wld) {
	System.out.println("im frm america"+" "+wld.getplace());
}
	switch(wld) {
	case America:{
		System.out.println("american");
		break;
	}
	case Asia:{   
		System.out.println("asian");
		break;
	}
	}
	
	}
}
