package com.company.java018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004_img {
	public static void main(String[] args) throws Exception {
		//#1 경로
		String origin = "src/com/company/java018/fm.jpg";
		String target1 = "src/com/company/java018/fm1.jpg";
		String target2 = "src/com/company/java018/fm2.jpg";
		
		//#2 byte 단위로 이미지파일 읽어들여서 쓰기 (O)
		// fm.jpg → fm1.jpg
		// InputStream (읽기) > [Program] > OutputStream (쓰기)
		InputStream  bis = new FileInputStream(origin);
		OutputStream bos = new FileOutputStream(target1);
		int cnt1 =0;
		while((cnt1=bis.read()) != -1) { bos.write((byte)cnt1); }
		bos.flush(); bos.close(); bis.close();
		System.out.println(">> byte 이미지 복사완료!"); // fm1.jpg #
		
		//#3 char 단위로 이미지파일 읽어들여서 쓰기 (X)
		// fm.jpg → fm2.jpg
		// Reader(읽기) > [Program] > Writer (쓰기)
		Reader cr = new FileReader(origin);     // fm.jpg
		Writer cw = new FileWriter(target2);    // fm2.jpg
		
		int cnt2=0;
		while((cnt2 = cr.read()) != -1) {cw.write((char)cnt2);}
		cw.flush(); cw.close(); cr.close();
		System.out.println(">> char 이미지 복사완료!");
	}
}
