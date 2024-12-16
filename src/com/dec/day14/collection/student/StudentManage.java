package com.dec.day14.collection.student;

import java.util.ArrayList;
import java.util.List;

// MVC 패턴의 Manage
public class StudentManage implements ManageInterface {
	// 필드	
	List<Student> stdList;
	
	// 생성자
	public StudentManage() {
		stdList = new ArrayList<Student>();
	}
	
	// 학생 등록
	@Override
	public void registerStudent(Student student) {
		stdList.add(student);
	}
	
	// 이름검색해서 리스트 반환
	@Override
	public List<Student> searchListByName(String name) {
		
		boolean being = false;
		
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getName().equals(name)) {
				being = true;
			}
		}
		
		if(being) {
			return stdList;
		}else {
			return null;
		}
	}
	
	// 이름 검색해서 학생 객체 반환
	@Override
	public Student searchOneByName(String name) {
		
		boolean being = false;
		int index = 0;
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getName().equals(name)) {
				being = true;
				index = i;
			}
		}
		
		if(being) {
			return stdList.get(index);
		}else {
			System.out.println("그런 학생은 없습니다.");
			return null;
		}
	}
	
	// 학생리스트 모두 반환
	@Override
	public List<Student> selectAllStudents() {
		return stdList;
	}
	
	// index번째 있는 학생 수정
	@Override
	public void modifyStudent(int index, Student student) {
		stdList.set(index, student);
	}
	
	// index번째 있는 학생 삭제
	@Override
	public void deleteStudent(int index) {
		stdList.remove(index);
	}
	// 재평가 대상 여부 확인
	public boolean retest(Student student) {
		if(student.getFirstScore()+student.getSecondScore()< 100) {
			return true;
		}else{
			return false;
		}
	}
	
}
