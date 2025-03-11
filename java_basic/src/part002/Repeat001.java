package part002;

class Coffee {
	String name; //커피이름
	int price;   //커피가격
	int num;     //커피잔수
	public Coffee(String name, int num, int price) {
		this.name = name;
        this.num = num;
        this.price = price;
	}
	Coffee() {
        this.name = "아메리카노";
        this.num = 1;
        this.price = 2000;
    }
	void show() {
        System.out.println("====커피");
        System.out.println("커피명  : " + name);
        System.out.println("커피잔수 : " + num);
        System.out.println("커피가격 : " + price);
	}
}
public class Repeat001 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼",2,4000);
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();
	}
}
/*
====커피
커피명:까페라떼
커피잔수 :2
커피가격 :4000
====커피
커피명 : 아메리카노
커피잔수:1
커피가격:2000

Repeat001.java                   <  java Repeat001.java
Coffee.class , Repeat001.class   <  java  Repeat001 
------------------------------------------------------------
[method : 정보보관]
[1번지]Coffee.class  
[2번지]Repeat001.class  ##1
------------------------------------------------------------
[heap : 동적]                         |       [stack:지역]
[2000]번지                               <----[a2 | 2000번지]
{ name="아메리카노", num=1 , price=1500 }                                   
[1000]번지                               <----[a1 | 1000번지]
{  name="까페라떼", num=2, price=4000  }    [main          ]
------------------------------------------------------------
*/
