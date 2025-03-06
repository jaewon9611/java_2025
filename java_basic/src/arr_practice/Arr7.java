package arr_practice;

public class Arr7 {
		public static void main(String[] args) {
			char arr[][] = new char[3][3];
			char data='a';
			for(int ch=0; ch<arr.length; ch++) {
				for(int kan=0; kan<arr[ch].length; kan++) {
					arr[ch][kan] = data++;
					System.out.print(arr[ch][kan]);
			}data='a'; System.out.println();
		}
	}
}