package arr_practice;

public class Arr6 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int data=3;
		for(int ch=0; ch<=3; ch++) {
		for(int kan=0; kan<arr[0].length -ch; kan++) {
			arr[ch][kan] = data;
			System.out.print(arr[ch][kan]);
		}data--; System.out.println();
	}
	}
}