package com.dec.day09.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	// 생성자
	public Suit(int size) { 
		this(size, "Hazzys"); // 2번째 생성자 호출
		System.out.println("Suit(int) 호출!!");
	}
	
	public Suit(int size, String brand) {
		this(size, brand, 100000); // 3번째 생성자 호출
		System.out.println("Suit(int, String) 호출!!");
	}
	public Suit(int size, String brand, int price) {
		// 생성자의 매개변수 값들을 클래스의 멤버변수에 넣어줌
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출!!");
	}
	
	public static void main(String[] args) {
		Suit s = new Suit(100);
	}
}
