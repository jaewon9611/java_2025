package part001;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng;
		System.out.println("국어점수를 입력하세요");kor=sc.nextInt();
		System.out.println("영어점수를 입력하세요");eng=sc.nextInt();
		if(kor<40) {System.out.println("국어과락");}
		if(eng<40) {System.out.println("영어과락");}
	}
}
/*  1형식은 무조건 IF구문안을 읽는다. 모든과목 체크
	[1]국어점수를입력해주세요 __입력받기
	[2]영어점수를입력해주세요 __입력받기 
	※ 과락인 모든과목을 출력해주세요.
	만약 국어점수가 40점 미만이라면 국어과락 
	만약 영어점수가 40점 미만이라면 영어과락 
*/