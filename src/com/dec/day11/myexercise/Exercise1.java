package com.dec.day11.myexercise;

class Super {
	public Super() {}
	
	public void voidMethod() {
		System.out.println("super");
	}
}

class Sub extends Super {
	int a;
	private int b;
	public Sub(int a) {
		super();
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void voidMethod() {
		System.out.println("sub");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Super s = new Sub(1); // 업캐스팅
		Sub sub = (Sub)s; // 다운캐스팅
		// int num = s.a; -> 업캐스팅되었기 때문에 접근 불가
		sub.setB(10);
		
	}
}
