package com.dec.day10.oop.inheritance;

import com.dec.day10.oop.inheritance.point.Point;

class Super {
	public int pub; 	// public 모두 공개
	int def;			// default는 같은 패키지 내에서
	protected int pro;  // protected는 같은 패키지 + 상속한 자식클래스에서
	private int pri;	// private는 외부로부터 차단
}

class Sub extends Super {
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		// super.pri = 4;
		Super sup = new Super();
		sup.pub = 502;
		sup.def = 1115;
		sup.pro = 1223;
		// sup.pri = 192;
	}
}

class ShapePoint extends Point {
	void set() {
		Point p = new Point(); // 상속받은 취급을 하지 않음, 새로운 객체를 만드는 취급
		p.pub = 11;
		// p.def = 12; -> 다른패키지라서 접근 불가능
		// p.pri = 12; -> private이라서 접근 불가능
		// p.pro = 12; -> 상속받은 취급을 하는 것이 아님
		super.pro = 112; // 상속한 경우 가능
		super.pub = 113;
		// super.def =114;
		// super.pri = 114;
	}
	public ShapePoint() { // 생성자
		Point point = new Point();
		// point.pro =11; 생성자에서 만들었다고 protected 멤버에 접근할 수 있는게 아님
	}
	void test() {
		// point.pro = 12; -> 생성자에서 만들었다고 쓸 수 있는게 아님
	}
}

public class Exam_Protected {

}
