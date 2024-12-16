package com.dec.day11.oop.abstractpkg.exercise;

abstract class Calculator { // 추상클래스
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

class MyCalculator extends Calculator {
	// 추상메소드의 오버라이딩
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int arrs : a) {
			sum += arrs;
		}
		return (double)sum/a.length;
	}
	
}