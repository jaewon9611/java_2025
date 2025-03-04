package part001;

public class SelfTest016 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		int data=100;
		
		for(int ch=0; ch<arr.length; ch++) {
		for(int kan=0; kan<arr[ch].length; kan++){arr[ch][kan] = data++;

		System.out.println(arr[ch][kan]);}
	data=200;
	System.out.println();}
}
}