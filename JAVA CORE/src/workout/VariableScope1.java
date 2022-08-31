package workout;

public class VariableScope1 {

	public static void main(String[] args) {
		school kids = new school();
		school students=new school();
		System.out.println(kids.primary+""+students.higher);
		System.out.println(kids.higher+""+students.higher);

	}

}
class school{
	convent primary=new convent();
	classrooms higher=new classrooms();
	
}
class convent{
	
}
  class classrooms{
	void met() {
		System.out.println("kidssss");
	}
	
}