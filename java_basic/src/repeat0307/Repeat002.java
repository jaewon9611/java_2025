package repeat0307;

import java.util.ArrayList;

/* 1. 클래스는 부품객체
   2. 멤버변수 / 멤버함수
   Q2. 상속도
   Object                            Object(){#3 }#4
     ↑
    Papa    money=10       /toString Papa()  {#2 }#5
     ↑
    Son     money=150,car=2/toString Son()   {#1 }#6 @Override
*/
class Papa{
	int money=10;
	public Papa() {}
	public Papa(int money) {this.money = money;}
	public String toString() {return "Papa[money=" + money + "]";}
}
class Son extends Papa{
	int money=150;
	int car=2;
	public Son() {super();}
	public Son(int money) {this.money = money;}
	public Son(int money , int car) {this.money = money;this.car=car;}
	public String toString() {return "Son[money = "+ money+",car="+ car + "]";}
	}

public class Repeat002 {
	public static void main(String[] args) {
		//--------------------------------------------STEP1
		Papa p1 = new Papa();  //[money=1, toString] = 1번지 {money= / toString}
		System.out.println(p1); // Papa[money=10]
		// Q3 출력되는 화면을 적으시오. 만약 컴파일러시 에러가 난다면 오류가나는 이유를 적으시오.
		
		//--------------------------------------------STEP2
		Son s2= new Son(); // Son s2 [money=150, car=2/toString]-[money=10/toString]
		//s2 = 2번지 {money=150, car=2/ toString}={money=10/-----}
		System.out.println(s2); // Son[money = 150,car=2]
		// Q4 출력되는 화면을 적으시오. 만약 컴파일러시 에러가 난다면 오류가나는 이유를 적으시오.
		
		//--------------------------------------------STEP3
		//Son s3 = (Son)new Son(); // Son s3 [money=150,car=2/toString]-[money=10/toString ]
		//    s3 = 3번지                                        Papa(){money=10/ toString}
		//System.out.println(s3);
		// Q5 출력되는 화면을 적으시오. 만약 컴파일러시 에러가 난다면 오류가나는 이유를 적으시오.
		//부모 객체는 자식 객체 변수 할당 불가
		
		//--------------------------------------------STEP4
		Papa p4 = new Son();
		//   s2 = 4번지 Son(){money=150,car=2/toString} -Papa(){money=10/------} @Override
		System.out.println(p4); //[money=1 ,toString] Son[money = 150,car=2]
		// Q6-1 출력되는 화면을 적으시오. 만약 컴파일러시 에러가 난다면 오류가나는 이유를 적으시오.
		System.out.println(p4.money); // Q6-2 출력되는 화면을 적으시오 // 10
		
		//--------------------------------------------STEP5
		Papa p5 = new Son(); //1. 부모 = 자식 / 업캐스팅 / 타입캐스팅필요  X
		Son s5 = (Son)p5;    //2. 자식 = 부모 / 다운캐스팅 / 타입캐스팅필요 O / 부모는 자식생성자를 호출한적이 있어야 한다.
		//Son             s5 [money=150,car=2/toString]-[money=10/toString]
		//    p5 = 5번지 Son(){money=150,car=2toString}- Papa(){money=10/-----}
		System.out.println(s5); // Son[money = 150,car=2]
		// Q7-1 출력되는 화면을 적으시오. 만약 컴파일러시 에러가 난다면 오류가나는 이유를 적으시오.
		System.out.println(s5.money); // 150
		System.out.println(((Papa)s5).money); // 10
		System.out.println(((Papa)s5).toString()); // Son[money = 150,car=2]
		// Q7-2 출력되는 화면을 적으시오. //150
		
		ArrayList<String> list = new ArrayList<>(); // ctrl + shift + o
	}
}
/*
Q8
오버로딩 : 메서드의 이름을 같게,다른 알규먼트 자료형과 갯수를 다르게 구분 / 목적:비슷한 기능
오버라이딩: 상속시 부모의 메서드를 자식에게 맞게 수정하여 사용




*/