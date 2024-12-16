package com.dec.day14.collection.student;

import java.util.*;

public class Practice_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 : ");
		int SecondScore = sc.nextInt();
		
		// 최종적으로는 Student 객체에 넣어야 함.
		// 1. 기본생성자 이용
		Student student = new Student();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(SecondScore);
		// 2. 매개변수 있는 생성자 이용
		student = new Student(name, firstScore, SecondScore);
		// 그 후에는 ArrayList 객체에 넣어야 함.
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(student);
//		Student [] stds = new Student[3];
//		stds[0] = student;
		Student std = stdList.get(0);
		System.out.println(std); // 객체를 출력하면 toString 메소드가 자동으로 실행
		
	}
}
