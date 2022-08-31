package workout;

public class ArrayVariable {

	public static void main(String[] args) {
	 int arr[]= {10,20,30,40};
     ArrayVariable obj =new ArrayVariable();
	System.out.println("before passing" +arr[3]);
	obj.pass(arr);
	System.out.println("after passsing"+arr[3]);
	}

void pass(int arr1[]) {
	 arr1[3]=55;
}
}
//reference variable because its a complex data type 
//for refernce variable the original will pass 
