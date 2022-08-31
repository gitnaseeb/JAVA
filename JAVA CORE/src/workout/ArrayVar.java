package workout;

public class ArrayVar {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
	ArrayVar ar = new ArrayVar();
	System.out.println("before " +arr[1]);
	ar.pass(arr);
	System.out.println("after"+arr[1]);
	
	}
	void pass(int arr1[]) {
		arr1[1]=33;
	
		
	}
}
