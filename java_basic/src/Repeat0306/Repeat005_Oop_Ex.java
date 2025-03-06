package Repeat0306;


class Parent {
	int i,j;
	public Parent() {super();} // Object()
	public Parent(int i, int j) {
		super();/// Object()
		this.i=i;
		this.j=j;
	}
}
class Child extends Parent {
	int k;
	public Child() {super();}//Parent()
	public Child(int i,int j, int k) {
		super(i,j);// Parent(int i, int j)
		this.k=k;
	}
}
/*
1. 클래스 부품객체 (멤버변수+멤버함수)
  Object            Object () {#3            }#4
  ↑
  Parent i, j       Parent(int i, int j){#2 i=10, j=20}#5
  ↑
  Child k           Child(10,20,30){#1 k=30}#6
*/
public class Repeat005_Oop_Ex {
	public static void main(String[] args) {
		Child child=new Child(10,20,30);
		System.out.println(child.i);
		System.out.println(child.j);
		System.out.println(child.k);
	}
}
