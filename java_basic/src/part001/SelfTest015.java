package part001;

public class SelfTest015 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int data = 1;
		for(int a=0; a<arr.length; a++){arr[a] = data++;
		System.out.println(arr[a]);
	}
}
}