package com.dec.day10.oop.inheritance.point;

public class Point {
	// 필드
	private int x, y;
	public int pub; 	// public 모두 공개
	int def;			// default는 같은 패키지 내에서
	protected int pro;  // protected는 같은 패키지 + 상속한 자식클래스에서
	private int pri;	// private는 외부로부터 차단
	
	// 생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}
