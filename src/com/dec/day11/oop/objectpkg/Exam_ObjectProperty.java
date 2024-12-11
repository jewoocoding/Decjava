package com.dec.day11.oop.objectpkg;

import com.dec.day10.oop.encapsulation.Book;

class Member {
	// 필드
	private String name;
	private int age;
	private String email;
	private String phone;
	private String address;
	// 생성자(오버로딩 사용)
	public Member() {}
	public Member(String name, int age) {
		this.name = name;
		this.setAge(age);
	}
	public Member(String email, String phone, String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.setAge(age);
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	// 메소드
	// getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void eat() {}
	public void sleep() {}
	
	// Object 클래스의 toString() 메소드는 자주 오버라이딩해서 사용함
	// 보통 클래스의 필드를 출력할 때 사용
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age
				+", 이메일 : " +email+", 전화번호 : "
				+phone+", 주소 : "+address;
	}
}

public class Exam_ObjectProperty {
	// 모든 클래스의 부모 클래스는 Object다.
	// 다형성 실현 -> 하나의 메소드로 각각 다른 클래스를 출력할 수 있음
	static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
	
//	static void print(Member member) {
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());
//	}
//	
//	static void print(Book book) {
//		System.out.println(book.getClass().getName());
//		System.out.println(book.hashCode());
//		System.out.println(book.toString());
//	}
	
	public static void main(String[] args) {
		
		// String constant pool : heap영역에 리터럴을 저장 
		// 똑같은 주소값이 됨
		// data == "Java"
		// "Java"가 String constant pool(상수풀)에 저장됨 -> 재활용 -> 같은 주소값을 가짐
		String data = "Java";
		
		// 새로 객체를 만들어서 data가 가리키게 함 -> "Java"리터럴과 다른 주소값을 가짐
		// data != "Java"
		data = new String("Java"); 
		if ("Java".equals(data)) {
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if ("Java" == data) {
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println();
		
		Member member = new Member();
		member = new Member("일용자", 22, "khuser01@kh.com", "01012345678", "서울시 중구");
		// 업캐스팅을 통해 사용
		// 오버라이딩을 통해 동적바인딩으로 동작
		print(member);
		// 오버라이딩 안 함 
		print(new Book());
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());
		// member.getClass().getName();
	}
}
