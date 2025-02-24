package mini_project;

public class Repeat003 {
	public static void main(String[] args) {
	for(int a=10; a<=30; a+=10) {System.out.print(a +"\t");} System.out.println();
	int a=10; while(a<=30) {System.out.print(a +"\t");a+=10;} System.out.println();
	a=10; do{System.out.print(a +"\t");a+=10;}while(a<=30); System.out.println();
	
	}
}
/*
for while do while 3가지 버전으로 10 20 30 출력
*/