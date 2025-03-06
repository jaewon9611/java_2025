package arr_practice;

public class Arr3 {
	public static void main(String[] args) {
		char arr[][] = new char[3][3];
		char star= '★';
		for(int ch=0; ch<3; ch++) {
			for(int kan=0; kan<arr[ch].length -ch; kan++) {
				arr[ch][kan] = star;
				System.out.print(arr[ch][kan]);
			}System.out.println();
		}
	}
}
