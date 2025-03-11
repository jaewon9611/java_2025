//package part002;
//
//public class Score {
//    private String name;
//    private int kor;
//    private int eng;
//    private int math;
//    private double avg;
//    private String pass;
//
//    
//    public Score(String name, int kor, int eng, int math) {
//        this.name = name;
//     this.kor = kor;
//        this.eng = eng;
//      this.math = math;
//      Avg();
//      Pass();
//    }
//
//    
//    private void Avg() {
//      this.avg = (kor + eng + math) / 3.0;
//   }
//
//    
//    private void Pass() {
//        this.pass = avg >= 60 ? "합격" : "불합격";
//    }
//
//    // Getter 메서드
//    public String getName() { return name; }
//    public int getKor() { return kor; }
//    public int getEng() { return eng; }
//    public int getMath() { return math; }
//    public double getAvg() { return avg; }
//    public String getPass() { return pass; }
//}
//
//public class Repeat005 {
//	public static void main(String[] args) {
//		
//	}
//}
////1. Score, ScoreProcess,ScorePrint 클래스와 ClassArr004 클래스
////패키지를 분리하시오.
//// 클래스들의 옵션은 다음과 같다. 멤버필드를 private 로 설정하시오
////3. 다음과 같이 출력되도록 main을 채우시오.
////
////::::::::::::::::::::::::::::::::::::::::::::::
////이름	국어	영어	수학	평균	합격여부
////::::::::::::::::::::::::::::::::::::::::::::::
////아이언맨 100 100 100 100.00 합격
////헐크	90	60	80	76.67	합격
////블랙팬서 20	60	90	56.67	불합격
