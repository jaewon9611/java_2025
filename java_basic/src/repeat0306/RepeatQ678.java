package repeat0306;
//1. 클래스는 부품객체 (상태-멤버변수 와 행위-멤버함수)
//              클래스변수,인스턴스변수,지역변수 / 클래스메서드,인스턴스메서드
// 변수 초기화 단계               
//                    기본값   명시적   초기화블록   생성자
// classValue          1)0  2)20     3)20     4)X
// instanceValue       5)0  6)10     3)10     4)10
class MemberCall001{
int instanceValue=10;     // 인스턴스변수 , heap area, new O , this
static int classValue=20; // 클래스변수 , method area, newX , 공유, 클래스명.변수명

int instanceValue2=classValue; //인스턴스변수 (5) = 클래스변수 (1)
//static int classValue2 = instanceValue; //1 error- static은 instance 사용불가
// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체생성후 사용 1)라인A

static void staticMethod1() {
//	System.out.println(classValue);
//	System.out.println(instanceValue);
}// instance는 new할당받고 사용가능하나 static는 바로사용
// 2)라인B
void instanceMethod1() {
	System.out.println(classValue);
	System.out.println(instanceValue);//3라인C
}
static void staticMethod2() {
	System.out.println(classValue);
	//instanceMethod1();4)라인D static은 instance(new) 사용불가
}
void instanceMethod2() { // 인스턴스 메서드 - heap area - newO - this
	staticMethod1(); //5)라인E
	}
}
public class RepeatQ678 {

}
