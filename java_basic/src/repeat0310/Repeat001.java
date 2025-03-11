package repeat0310;

class Coffee012 {
	String name; //커피이름
	int price;  //커피가격
	int num;   //커피잔수
	public Coffee012(String name, int num, int price) {
		this.name = name;
        this.num = num;
        this.price = price;
	}
	Coffee012() {
        this.name = "아메리카노";
        this.num = 1;
        this.price = 2000;
    }
	void show() {
        System.out.println("====커피");
        System.out.println("커피명 : " + name);
        System.out.println("커피잔수 : " + num);
        System.out.println("커피가격 : " + price);
}
}
public class Repeat001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
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
 
 
 
 
 */
