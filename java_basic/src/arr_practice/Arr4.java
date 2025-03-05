package arr_practice;

public class Arr4 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int data = 1;
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[0].length; kan++) {
				arr[ch][kan] = data;
				System.out.print(arr[ch][kan]);
			}System.out.println();data++;
		}
	}
}
