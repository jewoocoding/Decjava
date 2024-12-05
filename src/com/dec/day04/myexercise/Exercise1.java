package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise1 {
//	A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요. (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
//
//	ex.
//	A사원의 연봉 : 2500
//	B사원의 연봉 : 2900
//	C사원의 연봉 : 2600
//	A사원 연봉/연봉+a : 2500/3500.0
//	3000 이상
//	B사원 연봉/연봉+a : 2900/2900.0
//	3000 미만
//	C사원 연봉/연봉+a : 2600/2989.9999999999995
//	3000 미만
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int moneyA = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int moneyB = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int moneyC = sc.nextInt();
		
		double incentiveA = moneyA+moneyA*0.4;
		double incentiveB = moneyB;
		double incentiveC = moneyC+moneyC*0.15;
		
		String richA, richB, richC;
		if(incentiveA >=3000)
			richA = "3000이상";
		else
			richA = "3000미만";
		if(incentiveB >=3000)
			richB = "3000이상";
		else
			richB = "3000미만";
		if(incentiveC >=3000)
			richC = "3000이상";
		else
			richC = "3000미만";

		
		System.out.println("A사원의 연봉/연봉+a : "+moneyA+"/"+incentiveA);
		System.out.println(richA);
		System.out.println("B사원의 연봉/연봉+a : "+moneyB+"/"+incentiveB);
		System.out.println(richB);
		System.out.println("C사원의 연봉/연봉+a : "+moneyC+"/"+incentiveC);
		System.out.println(richC);
		
	}
}
