package workout;

public class Returnmet {
 int   mymet(int x,int y) {

	 
System.out.println("hello :" +x);
return x;

 
} 
		public static void main(String[]args) {
Returnmet obj=new Returnmet();
obj.mymet(0,5);


}
}
//two types of method returnable and non returnable method
//if void is there then it is non returnable method
//method always call by using object