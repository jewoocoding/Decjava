package com.dec.day11.oop.objectpkg.exercise;

public class Exercise_PointEquals {
	/*
	 * Point 클래스의 두점의 좌표가 같으면 true를 리턴하는 equals()를 작성하고
	 * 2, 3 포인트 객체와 다시 생성한
	 * 2, 3 포인트 객체가 같도록 출력하는 프로그램을 작성하시오
	 */
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		
		// Point 클래스에서 overriding된 equals메소드를 사용 
		if (p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
