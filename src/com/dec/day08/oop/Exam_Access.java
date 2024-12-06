package com.dec.day08.oop;
/*
 * 접근지정자(제한자)
 * 종류 : public, protected, default, private
 */
// 한 파일 내에서 public class는 하나만 존재가능?
class Sample{
	public int everyone;
	private int onlyme;
	int onlyus;
}


public class Exam_Access {
	public static void main(String[] args) {
		
		Sample smp = new Sample();
		smp.everyone = 1234; // public 멤버변수 -> 어디서나 접근 가능
		// smp.onlyme = 1234; -> private 멤버변수라서 접근 불가능
		smp.onlyus =  12345; // default 멤버변수, 같은 패키지내에서 접근 가능
	}
}
