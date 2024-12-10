package com.dec.day10.oop.inheritance.point;

public class ColorPoint extends Point{
//	private int x, y; -> 부모의 필드에 이미 있기 때문에 굳이 쓸 필요가 없다.
	// 필드
	private String color;
	
	// 생성자
	public ColorPoint() {
		super(); // 부모의 생성자를 부름 -> 없어도 컴파일러가 자동으로 부모의 기본생성자를 불러줌
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모의 매개변수가 있는 생성자를 부름
//		this.x = x; -> private 멤버변수라서 접근할 수 없음
//		this.y = y; 
		this.color = color;
	}
	
	public void showColorPoint() {
//		super.x = 10; -> private 멤버변수라서 접근할 수 없음
		super.showPoint(); // 부모의 메소드 사용
		System.out.println(this.color+"색의 점입니다.");
	}
}
