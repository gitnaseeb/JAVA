package workout;

public class InnerClass {

	public static void main(String[] args) {
	outer.Inner obj =new outer.Inner();//for static class
	obj.met();
	
	outer.nsInner obj1 =new outer().new nsInner();//non static class
	obj1.met();
	}

}
 class outer{
	static  int i=100;
	void nsmet() {
		System.out.println("non static met of outerr...");
		
	}
	static void smet() {
		System.out.println("static met of outer....");
		
	}
	static class Inner{
		int n =200;
		void met()
		{
			System.out.println("met in inner class.."+i);
			smet();
			System.out.println(this .n);
			
			
		}
	}
	class nsInner{
		void met() {
			System.out.println("met ns inner called...");
		}
	}
}
 //outer class can given static
 //inner class must in static 
 //inner class can access outer class but outer cannot access inner