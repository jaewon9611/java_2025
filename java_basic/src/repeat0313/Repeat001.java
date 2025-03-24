package repeat0313;

class Milk {
	private String name;  
    private  int price;
	public Milk() { this.name = "white"; this.price=1300; }
	public Milk(String name, int price) { super(); this.name = name; this.price = price;}
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
class MilkPrint{
	void show(Milk []milks) {
	for(int i=0; i<milks.length; i++) {
		System.out.println(milks[i].getName() + "/" + milks[i].getPrice());
	}
	}
}

public class Repeat001 {
	public static void main(String[] args) {
		//Q3. 클래스
		Milk m1 = new Milk("choco" , 1200);
		System.out.println( m1 );  // 출력된 결과 : choco / 1200
		Milk m2 = new Milk();
		System.out.println( m2 );  // 출력된 결과 : white / 1300
		//Q4. 클래스배열
		Milk []milks = new Milk[3];         // milks = [null,null,null]
		milks[0] = new Milk("white",1000);  // milks[0] = 1번지 {"white", 1000}
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		MilkPrint  print = new MilkPrint();   
		print.show(  milks     );	
		// 리턴값 메서드명 파라미터
		// void show(Milk []milks); // milks = [1번지 ,2번지 , 3번지]
		
		//Q5. 다형성
		/*
		Object
		   ↑
		TestA2 {a=10 / toString}
		   ↑
		TestB2 {b=10 / toString}
		*/
		TestA2 ta = new TestA2(); // ta{a=10 / toString} = 1번지 {a=10 / toString}
//		TestB2 tb = (TestB2) ta;
//		 5-2 {b =20 / toString}-{a = 10 / toString} tb = 1번지 {a=10 / toString}
//		     {b =20 / toString} 부분을 사용할수 없음!
//		//      자식 = 부모  / 다운 캐스팅 / 타입캐스팅
		
		// 5-3 해결방안                                              TestB2() → TeatA2() → Obhect{}
		ta = new TestB2(); //ta {a=10/toString} = 2번지{b =20 / toString}-{a=10 / toString}
		TestB2 tb = (TestB2) ta;
		//             자식   = 부모 / 다운캐스팅 / 타입캐스팅O - 부모는 자식생성자를 호출한 적이 있어야 한다.
		
		
		
	}
}
//출력된 결과 : 
//		 * white  / 1000
//		 * choco  / 1200
//		 * banana / 1500 