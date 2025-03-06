package Repeat0306;

class Papa extends Object {
	int money=10000;
	public Papa() {super();}
	public void sing() {System.out.println("GOD-거짓말");}
}

class Son2 extends Papa {
	int money = 1500;
	public Son2() {super();}
	@Override public void sing() {System.out.println("빅뱅-거짓말");}
}
public class Polymorphism005 {
	public static void main(String[] args) {
		//Q8. 부모 = 자식 관계 / 업,다운캐스팅 선택 / 타입캐스팅 필요여부
		// >> 부모는 자식을 담을수 잇다.
		Papa mypapa = new Son2();
		//Q3. Papa mypapa 의미? {money=10000/sing()} 쓸수 있게 해줄께!
		//Q4. 인스턴스화한 실체 메모리 빌려온그림
		//	1번지{money=1500 / sing()빅뱅-거짓말}-{money=10000/-----}
		
		//>>mypapa = 1번지{money=1500 / [sing()빅뱅-거짓말}-{money=10000]-----}
		System.out.println(mypapa.money); // Q5. 출력 10000
		mypapa.sing(); // Q6출력 빅뱅-거짓말
		//Q7. mypapa.money를 이용해서 1500 출력되게 해주세요.
		System.out.println(((Son2)mypapa).money);
	}
}
