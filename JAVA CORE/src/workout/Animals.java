package workout;

public class Animals {
	
void animalsounds() {
	System.out.println("all animal make different sound");
}
	public static void main(String[] args) {
		Animals obj = new lion();
		obj.animalsounds();
	

	}

}
class lion extends Animals{
	
	void animalsounds() {
		System.out.println("Roooaar  " );
		super.animalsounds();
	}
	
}
