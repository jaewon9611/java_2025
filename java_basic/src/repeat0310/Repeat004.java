package repeat0310;

class User004{
	final char division; //A,B,C,D 4가지 타입으로 분류할 수 있다.
	 final String jumin;
	 
	 public User004(char division, String jumin) { this.division = division; this.jumin = jumin; }
	 public User004() { this.division = 'A'; this.jumin = "123456-1234567"; }
	 @Override public String toString() { return "User004 [division=" + division + ", jumin=" + jumin + "]"; }
}

public class Repeat004 {
	public static void main(String[] args) {
	User004 c1 = new User004('B', "200101-1234567"); System.out.println(c1);
	User004 c2 = new User004(); System.out.println(c2);
	}
}
//다음과 같이 출력되도록 코드 수정
//User004 [division=B, jumin=200101-1234567]
//User004 [division=A, jumin=123456-1234567]
//분류 타입인 division와 jumin 번호는 바뀌면 안되게 설정 후
//각 유저마다 데이터를 저장할수 있게 만드시오.