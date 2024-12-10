package com.dec.day10.oop.inheritance;

import java.nio.charset.CoderMalfunctionError;

import com.dec.day10.oop.inheritance.point.ColorPoint;
import com.dec.day10.oop.inheritance.point.Point;

public class Exam_Inheritance {
	public static void main(String[] args) {
		// super class 객체 생성
		Point point = new Point();
		point.setX(11);
		point.setY(18);
		point.showPoint();
		
		// sub class 객체 생성
		ColorPoint colorPoint = new ColorPoint();
		colorPoint = new ColorPoint(12, 25, "red");
		colorPoint.showColorPoint();
		// 부모클래스의 메소드 사용
//		colorPoint.setX(5);
//		colorPoint.setY(2);
//		colorPoint.showPoint();
	}
}
