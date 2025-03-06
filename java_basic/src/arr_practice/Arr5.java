package arr_practice;

public class Arr5 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int data=1;
		for(int ch=0; ch<arr.length; ch++) {
		for(int kan=0; kan<=ch; kan++) {
			arr[ch][kan]= data;
			System.out.print(arr[ch][kan]);
			}data++; System.out.println();
		}
	}
}
