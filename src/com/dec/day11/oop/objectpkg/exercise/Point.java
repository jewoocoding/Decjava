package com.dec.day11.oop.objectpkg.exercise;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) { // Object 클래스의 equals메소드 오버라이딩
		Point p = (Point)obj; // parameter로 받아온 인스턴스를 포인트 레퍼런스로 다운캐스팅
		return (this.x == p.x)&&(this.y == p.y); // x,y가 모두 같으면 true 반환
	}
}
