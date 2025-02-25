package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {
	public static void main(String[] args) {
		String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
	    int[] kor={100,20,90,70,35};   
	    int[] eng={100,50,95,80,100};
	    int[] mat={100,30,90,60,100};
	    int[] aver=new int[5];
	    String[] pass = new String[5];
	    String[] stu = new String[5];
	    String[] rank = new String[5];
	    // 평균이 1번째로 높으면 1등
	    // 평균이 2번째로 높으면 2등
	    // 평균이 3번째로 높으면 3등
	    // 평균이 4번째로 높으면 4등
	    // 평균이 5번째로 높으면 5등
		//	    aver[0] = (kor[0]+eng[0]+mat[0])/3;
		//	    aver[1] = (kor[1]+eng[1]+mat[1])/3;
		//	    aver[2] = (kor[2]+eng[2]+mat[2])/3;
		//	    aver[3] = (kor[3]+eng[3]+mat[3])/3;
		//	    aver[4] = (kor[4]+eng[4]+mat[4])/3;
	   
	    for(int i=0; i<aver.length; i++){aver[i] = (kor[i]+eng[i]+mat[i])/3;}
	    
	    //if(aver[0]>=60) {pass[0] = "합격";}
	   //else {pass[0] = "불합격";}
	    
	    for(int i =0; i<aver.length; i++){if(aver[i]>=60) {pass[i] = "합격";}
	    else {pass[i] = "불합격";}}
	    for(int i =0; i<aver.length; i++)if(aver[i] >=95) {stu[i] = "장학생";}
	    else {stu[i] = "------";}
	    
	    //System.out.println(Arrays.toString(pass));
	    //System.out.println(Arrays.toString(aver));
	    //System.out.println(Arrays.toString(stu));
	    System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
	    		+"\r\n이름   국어      영어     수학     평균     합격여부  장학생   "
	    		+"\r\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	    for(int i=0; i<aver.length; i++){System.out.println(name[i] +"\t"+ kor[i]+"\t" + eng[i]+"\t" + mat[i]+"\t" + aver[i]+"\t" + pass[i]+"\t"+ stu[i]);}
		//	    System.out.println(name[1] +"\t"+ kor[1]+"\t" + eng[1]+"\t" + mat[1]+"\t" + aver[1]+"\t" + pass[1]+"\t"+ stu[1]);
		//	    System.out.println(name[2] +"\t"+ kor[2]+"\t" + eng[2]+"\t" + mat[2]+"\t" + aver[2]+"\t" + pass[2]+"\t"+ stu[2]);
		//	    System.out.println(name[3] +"\t"+ kor[3]+"\t" + eng[3]+"\t" + mat[3]+"\t" + aver[3]+"\t" + pass[3]+"\t"+ stu[3]);
		//	    System.out.println(name[4] +"\t"+ kor[4]+"\t" + eng[4]+"\t" + mat[4]+"\t" + aver[4]+"\t" + pass[4]+"\t"+ stu[4]);
	
	
	}
}
/*
배열을 이용하여 다음의 프로그램을 작성하시오. 
String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
    int[] kor={100,20,90,70,35};   
    int[] eng={100,50,95,80,100};
    int[] mat={100,30,90,60,100};
    int[] aver=new int[5];

     1. 평균구하시오.
     2. 합격,불합격   -  평균이 60점이상이면 합격, 아니면 불합격으로 처리하시오.
     3. 장학생   - 평균 95점이상이면 장학생으로 처리하시오. 
      
3.출력예시:     
   :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   이름      국어   영어   수학   평균   합격여부   장학생   
   :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   아이언맨   100   100   100   100      합격   장학생   
   헐크      20   50   30   33   불합격   ----   
   캡틴      90   95   90   91   합격   ----   
   토르      70   80   60   70   합격   ----   
   호크아이   35   100   100   78      합격   ----   
   :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

   ※ 힌트1)    
    /////// 처리1 : 평균구하기  
    1-1. (국어+영어+수학)/3
   1-2.  아이언맨의 평균 =  아이언맨의 국의 + 아이언맨의 영어 + 아이언맨의 수학 
   1-3.  aver[0] = kor[0] + eng[0] + mat[0]
   
   1-2.  헐크의 평균 =  아이언맨의 국의 + 아이언맨의 영어 + 아이언맨의 수학 
   1-3.  aver[1] = kor[1] + eng[1] + mat[1]

   /////// 처리2 : 합격,불합격 
   2-1. 평균이 60점이상이면 합격    아니면 불합격
   2-2. 어디다가 합격, 불합격을 담아놓을 것인가? ※ 필요한것 : 합격,불합격을 담을 배열     
   2-3. 아이언맨의 평균이 60점 이상이라면 합격 / 아니면 불합격
   2-4. if(aver[0] >=60){   합격 } else{불합격} 

   /////// 처리3 : 장학생
   3-1. 평균 95점이상 장학생
   3-2. 어디다가 장학생을 담아놓을 것인가? ※ 필요한것 :  장학생 여부를 저장할 배열 
   3-3. 아이언맨의 평균이 95점이상이면 장학생 / 아니라면 ----
   3-4.  if(aver[0] >=95){ 장학생 } else{ ---- } 
 
*/
