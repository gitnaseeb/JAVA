package aspire;
public class Lambda1 {

	public static void main(String[] args) {
		Exporter exp=()->{System.out.println("do export in lambda way");};
		exp.doexport();
		Importer imp =(String s,int m)->{System.out.println("import in lambda way" +" "+s+" "+m);};
		imp.doimport("nax",1000);
	}

}
interface Exporter{
	public void doexport();
}
class Expoter1 implements Exporter{
	@Override
	public void doexport() {
		System.out.println("do export implemented old way");
	}
}
interface Importer{
	public void doimport(String name,int money);
}
