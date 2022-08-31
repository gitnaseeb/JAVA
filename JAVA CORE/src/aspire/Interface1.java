package aspire;
public class Interface1 {

	public static void main(String[] args) {
		CEO obj=new employee();
		obj.work();
		obj.food();
	

	}

}
interface CEO{
	private void reportToUS() {
		System.out.println("reportng to US alwyas");
	}
	private void workForUS() {
		System.out.println("working only for US");
	}
	private void giveProfit() {
		System.out.println("giving profit for US");
	}default void work() {
		workForUS();
		reportToUS();
		giveProfit();
	} 
	static void doreport() {
		System.out.println("reporting to US Boss");
	}
	public void food() ;
		
	
}
class employee implements CEO{
	@Override
	public void food() {
		System.out.println("veggies");
	}
}