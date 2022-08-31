//this is generics
package aspire;
public class AnnoDemo {

	public static void main(String[] args) {
		TiffenBox<NonVegFood> box =NonVegCanteenContainer.getBox();
		NonVegFood food =box.getItem();
		System.out.println(food);
		TiffenBox<VegFood> box2=VegCanteenContainer.getBox();
		VegFood food2=box2.getItem();
		System.out.println(food2);
		TiffenBox<Currency> box3=HalwaContainer.getBox();
		Currency currency=box3.getItem();
		System.out.println(currency);
	}

}
class NonVegCanteenContainer{
	public static TiffenBox<NonVegFood> getBox(){
TiffenBox<NonVegFood>box = new TiffenBox<>();
box.setItem(new NonVegFood());
return box;
	}

}
class VegCanteenContainer{
	public static TiffenBox<VegFood> getBox(){
		TiffenBox<VegFood> box = new TiffenBox<>();
		box.setItem(new VegFood());
		return box;
	}
}
class HalwaContainer{
	public static TiffenBox<Currency> getBox(){
		TiffenBox<Currency> box = new TiffenBox<>();
		box.setItem(new Currency());
		return box;
	}
}
class TiffenBox<T>{
	 T item;
	 public T getItem() {
		 return item;
	 }
	 public void setItem(T item) {
		 this.item=item;
	 }
}
class Food{}
class NonVegFood extends Food{}
class VegFood extends Food{}
class Currency{}