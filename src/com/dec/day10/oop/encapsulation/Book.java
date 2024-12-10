package com.dec.day10.oop.encapsulation;

public class Book {
	// 제목과 저자의 필드 생성
	private String name;
	private String author;
	
	// 생성자 생성
	public Book() {}
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	// getter/setter 생성
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return this.name;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book = new Book("춘향전", "작자미상");
		book.setName("어린왕자");
		book.setAuthor("생텍쥐페리");
		
		System.out.println("책 제목 : "+book.getName());
		System.out.println("저자 : "+book.getAuthor());
	}
}
