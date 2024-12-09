package com.dec.day09.objectarray;

class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	// 기본 생성자(생략 가능), JVM이 알아서 생성해줌
	public Student() {}
	
	// 매개변수 있는 생성자
	public Student(String name) {
		this.name = name;
	}
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return (kor+eng+math)/3.0;
	}
}

public class StudentArray {
	public static void main(String[] args) {
		// 객체 배열 생성
		Student[] students = new Student[3];
		
		students[0] = new Student("일용자", 99, 88, 77);

		students[1] = new Student("이용자", 66, 55, 44);
//		students[1].name = "이용자";
//		students[1].kor = 99;
//		students[1].eng = 88;
//		students[1].math = 77;
		
		students[2] = new Student("삼용자", 33, 22, 11);
//		students[2].name = "삼용자";
//		students[2].kor = 99;
//		students[2].eng = 88;
//		students[2].math = 77;
		
		for(Student std : students) {
			System.out.println("이름 : "+std.name);
			System.out.println("국어 : "+std.kor);
			System.out.println("영어 : "+std.eng);
			System.out.println("수학 : "+std.math);
			System.out.println("총점 : "+std.total());
			System.out.println("평균 : "+std.avg());
		}
	}
}
