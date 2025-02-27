package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004{ 
		public static int process_total(int kor ,int eng ,int math) {return (kor+eng+math);}
		
		public static float process_avg(int total) {return total/3f;}
		
		public static String process_pass(float avg , int kor , int eng, int math) {
			return avg<60? "불합격" : kor<40 || eng<40 || math<40? "재시험" : "합격";}
		
	    public static String process_scholar(float avg) {if(avg>=95) {return ("장학생");}
	     												  else	      {return("===");}}
	    
	    public static String process_star(float avg) {
	    String result ="";
	    for(int i=0; i<(int)avg/10; i++) {result +="*";}
	    return result;
	    }
	    /*if(avg>=70)   {return "*******";}
		   else if(avg>=80)  {return "********";}
		   else if(avg>=90)  {return "*********";}
		   else if(avg>=100) {return "**********";}
		   else 		     {return "null";}
		   */
	    public static String process_show(
	  	String name, int kor, int eng, int math, int total,float avg, String pass, String jang, String star) {
	    	return name +"\t"+kor+"\t" + +eng+"\t" +math+"\t" +total+"\t" +String.format("%.2f", avg)+ "\t" +pass+"\t" +jang+"\t" +star;}
	   public static void main(String[] args) {
	      /////////////////////(1)  변수
	      String name  = ""; 
	      int kor, eng, math, total ;
	      float avg = 0.0f; 
	      String pass = "";
	      String jang = "";
	      String star= ""; 
	      Scanner sc = new Scanner(System.in);
	      
	      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	      System.out.print("이름을 입력하시오 :"); name=sc.next();
	      System.out.print("국어 점수를 입력하시오 :"); kor=sc.nextInt();
	      System.out.print("영어 점수를 입력하시오 :"); eng=sc.nextInt();
	      System.out.print("수학 점수를 입력하시오 :"); math=sc.nextInt();
	      /////////////////////(3) 처리 : 
	      total = process_total(kor , eng, math);    // 1. 총점처리
	      
	      avg = process_avg(total);    //2.  평균처리
	      
	      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	      pass = process_pass(avg , kor, eng, math);  
	      
	      //////// 4. 평균이 95점이상이면 장학생
	      //public static double process_scholar(double a) {if(a<=95) return "장학생"}
	      //												else{===}
	      jang = process_scholar(  avg  ); 
	      
	      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	      // public static String process_star(double avg) {if(avg>=100) {return "**********";}
	      //										   else if(avg>=90)  {return "*********";}
	      //										   else if(avg>=80)  {return "********";}
	      //										   else if(avg>=70)  {return "*******";}
	      //										   else 		     {return "null";}
	      star = process_star(avg);  
	      
	      
	      /////////////////////(4) 출력
	      //// public static String process_show(
	      //String name, int kor, int eng, int math, double avg, String pass, String jang, String star) { }
	      System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: "
	    		  + "\n\r이름    국어     영어     수학     총점     평균    합격여부   장학생   랭킹"
	    		  + "\n\r:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	      System.out.println(process_show(name, kor, eng, math, total, avg, pass, jang, star));
	    
	      
	   }// end main
	 
	   
	}// end class

	 
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
// 이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
//   --------------------------------------------------------------------------------------------
//   아이언맨   100   100   100   300    100.0    합격      장학생   **********
//   --------------------------------------------------------------------------------------------
