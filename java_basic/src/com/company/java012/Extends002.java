package com.company.java012;
/*                                                  30번째: Green mygreen = new Green();
   Object {  }                                     Object() {#3  }#4 
   ↑
   Color     name(private)                         Color()  {#2  }#5 name 인스턴스변수 사용가능
   ↑
   Green    num(private) /void show(){}            Green()  {#1  }#6 num 인스턴스변수 사용가능   
*/

	
class Color extends Object {
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
}
class Green extends Color{
	private int num;
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	
	public void show() {System.out.println(
			":::::Green \n"+"= NAME :"+super.getName() + "\n"+"= NUM  :" + this.num);
		
	}
}

public class Extends002 {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.setNum(5);
		mygreen.show();
	}
}
/*






*/