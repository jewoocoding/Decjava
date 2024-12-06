package com.dec.day08.method;

import com.dec.day08.oop.Circle;

public class Run_Method {
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		pizza.radius = 11; // 멤버의 접근 지정자를 public으로 바꿔서 가능하게 되었음
		
		Exam_Method ex = new Exam_Method();
		
		// 리턴형 X, 매개변수 X
		ex.Exam1();
		
		// 리턴형 O, 매개변수 O
		ex.Exam2();
		
		// 리턴형 X, 매개변수 O
		ex.Exam3(1, 2, 3);
		
		// 리턴형 O, 매개변수 O
		ex.Exam4(5, 6);
		
		System.out.println(ex.Exam2()); // 인스턴스의 메소드 사용을 리턴타입 리터럴처럼 사용 가능
		
		int result = ex.sum(1,2,3,4,5); // 가변인자로 매개변수 입력받음
		System.out.println("result : "+ result); // 결과 출력
		
	}

}
