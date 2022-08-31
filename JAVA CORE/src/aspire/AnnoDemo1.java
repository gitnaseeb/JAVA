package aspire;
import java.util.Collection.*;
import java.lang.reflect.Field;

public class AnnoDemo1 {

	public static void main(String[] args)throws Exception {
		WatchMan ramu = new Agency().getWatchMan();
		System.out.println(ramu.cap);
 System.out.println("color of cap is" +ramu.cap.color);
	}

}
class Agency{
	public WatchMan getWatchMan()throws Exception{
		
		WatchMan ramu = new WatchMan();
		Class c=ramu.getClass();
		Field f=c.getDeclaredField("cap");
		f.setAccessible(true);
		 Inject inj=f.getAnnotation(Inject.class);
		 if(inj!=null) {
			 String v=inj.value();
			 Cap cap = new Cap();
			 cap.color=v;
			 ramu.cap= cap;
			
		 }
		 return ramu;
	}
	
}
class WatchMan{
	@Inject//(value="recap")
	Cap cap;
	Stick stick;
	Torch torch;
	
}
class Stick{}
class Torch{}
class Cap{
	String color;
}
