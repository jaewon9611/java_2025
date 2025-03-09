package repeat0307;
/*
         fruit(------------)
          ↑       ↑       ↑
         Apple  Banana  Coconut -myfruit() - @Override

*/
abstract class Fruit {
	@Override public String toString() {return "Fruit";}
	public abstract void myFruit();
	
}
class Apple extends Fruit {
	@Override public void myFruit() {System.out.println("사과는 빨갛다");}
	}
class Banana extends Fruit {
	@Override public void myFruit() {System.out.println("바나나는 노랗다"); }
}

class Coconut extends Fruit {
	@Override public void myFruit() {System.out.println("코코넛은 코코하다."); }
}

public class Repeat003 {
	public static void main(String[] args) {
		Fruit [] fruits = {new Apple(), new Banana(), new Coconut()};
		//부모           = 자식들
		//한개의 자료형(부모)으로 여러개의 객체들(자식들을 관리)
		for(Fruit f: fruits) { f.myFruit();}
	}
}
/*
Q8
오버로딩 : 메서드의 이름을 같게,다른 알규먼트 자료형과 갯수를 다르게 구분
목적:비슷한 기능
오버라이딩: 부모에서 자식클래스로 같은메서드명 같은 매개변수 사용

Q9 abstract → 추상화 , 일반화 , 공통의 기능
- 실체화된 객체들 간에 공통되는 특성을 추출한 것
- 미완성적인 개념 ( new 사용하지 못함 )
- 공통된 필드와 메서드의 이름을 통일할 목적

Q10 interface → 실체화관계 
개발코드와 객체사이 연결
- 개발코드변경없이 객체를 바꿔낄수 있도록 하는 역할

Q11 abstract / interface 차이점
공통점 : 자식클래스를 통해서 설계부분을 구현한다.
차이점 : abstract 일반클래스+ 설계도
       interface         설계도   추상화정도가 interface 가 높다.
abstract - 인스턴스변수, 일반메서드 추상메서드 둘다 가질 수 있으나
interface - 상수(public static final) + 추상메서드(public abstract)만 가짐
*/