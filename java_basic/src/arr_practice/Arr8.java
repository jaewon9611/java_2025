package arr_practice;

public class Arr8 {
	public static void main(String[] args) {
		char arr[][] = new char[3][3];
		char data='a';
		for(int ch=0; ch<arr.length; ch++) {
			data++;
			for(int kan=0; kan<=ch; kan++) {
			arr[ch][kan] = data;
			System.out.print(arr[ch][kan]);
			
			}
			 System.out.println();
		}
	}
}