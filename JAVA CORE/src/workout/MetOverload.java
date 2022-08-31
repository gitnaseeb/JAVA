package workout;

public class MetOverload {
 int mymet1(int x,int y) {
	System.out.println("the value is : "+x);
	return x;}
static int mymet1(int z,float w) {
	System.out.println("second value is : "+z);
	return z;
}
public static void mai(String[]args) {
	MetOverload obj=new MetOverload();
	obj.mymet1(4,5);

}
}
//methodoverloading is the method name will same but it will have different parameters
//and the method will call in main class by creating constructor or object and the values be pass in object is called arrgument