package repeat0310;

class Sawon005{
	int pay=10000;
	
	static int su = 10;
//	static int basicpay=pay;////###000 클래스변수인데 인스턴스변수로 사용
	static int basicpay2;
	static {basicpay2=20000;}
	
	public static void showsu() {System.out.println(su);} ////###001
	//public static void showPay() {System.out.println(this.pay);}////$$$002 this 사용불가
	public void showAll001() {////###003
	System.out.println(su);
	System.out.println(this.pay);
	}
//	public static void showAll002() {////###004 인스턴스 메서드에서 static 호출불가
//	showAll001();
//	System.out.println(this.pay);
	}


public class Repeat003 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
	}
}
// 다음 클래스를 작성해보고 에러가 난다면 에러나는 이유를 적으시오.