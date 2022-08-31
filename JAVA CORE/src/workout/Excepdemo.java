package workout;

public class Excepdemo {

	public static void main(String[] args) throws Exception {
		Dog dog = new Dog();
		child baby = new child();
		baby.playWithDog(dog, "stickkk");
		
		
	}

}
class child{
	public void playWithDog(Dog dog1,String item) {
		try { 
			dog1.play(item);
		}
		catch(DogBiteException e) {
			System.out.println(e);
		}
	}
}
class Dog{
	public void play(String item) throws DogBiteException{
		if(item.equals("stick")) {
			throw new DogBiteException("DogBiteException...");
		}else {
			System.out.println("not found");
		}
	}
}
class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return "ERROR:"+msg;
	}

	}
	
