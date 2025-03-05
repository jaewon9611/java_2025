package com.company.java012;
//1 클래스는 부품객체
//2 상태는 멤버변수 + 행위는 멤버함수
//3 상속 - 클래스 재사용(재활용)
//        오버라이드(@Override)- 부모에서도 나한테맞게 수정
/*
                        Object
            ↑                       ↑
          Grand( one(),two())     Aunt(name,toString())
          ↑         ↑
         father    uncle
        (three())   (four()/ one(), two())
*/
class Grand extends Object {
	public void one() {System.out.println("Grand: one");}
	public void two() {System.out.println("Grand: two");}
} //end Grand

class Aunt   extends Object {
	String name="MiMi";
	@Override public String toString() {return name + "옆집이모클래스";}
	
} // end Aunt

class Father extends Grand {
	public void three() {System.out.println("Father: three");}
} // end Father

class Uncle  extends Grand {
	public void four() {System.out.println("Uncle: four");}
	public void one()  {System.out.println("Uncle: one");}
	public void two()  {System.out.println("Uncle: two");}
} // end Uncle

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three(); father.two(); father.one();
		Uncle uncle = new Uncle(); uncle.four(); uncle.two(); uncle.one();
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);
	}
}
