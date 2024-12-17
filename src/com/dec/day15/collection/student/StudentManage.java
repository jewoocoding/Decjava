package com.dec.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface {
	// 필드
	List<Student> stdList;
	
	//메소드
	public StudentManage() {
		stdList = new ArrayList<Student>();
	}
		
	@Override
	public void registerStudent(Student student) {
		stdList.add(student);
	}

	@Override
	public void deleteStudent(int index) {
		stdList.remove(index);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		stdList.set(index, student);
	}

	@Override
	public List<Student> searchListByName(String name) {
		if(name != null) { // 이름이 입력되었을 때 동작하도록 함.
			for(Student std : stdList) { // stdList를 검색하여 name과 같은 값 찾기
				if(name.equals(std.getName())) {
					return stdList;
				}
			}
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) { // name이 입력됐을 때 동작
			for(Student std : stdList) { 
				if(name.equals(std.getName())) { // stdList에 같은 이름을 가진 student가 있는지 확인
					return std; // 있다면 그 학생객체 리턴
				}
			}
		}
		return null; // 없으면 null 리턴
	}

	@Override
	public int searchIndexByName(String name) {
		int index = -1; // 없으면 -1리턴
		if(name != null) { // name을 입력했을 때 동작
			for(int i=0; i< stdList.size();i++) {
				if(name.equals(stdList.get(i).getName())) { // 이름이 같은지 확인
					index = i; // 그때의 인덱스 리턴
				}
			}			
		}
		
		return index; 
	}

	@Override
	public List<Student> selectAllStudents() {
		return stdList;
	}
	
	@Override
	public String retest(Student student) {
		int score1 = student.getFirstScore();
		int score2 = student.getSecondScore();
		double avg = (score1+score2)/2.0;
		StringBuffer msg = new StringBuffer();
		if(avg >= 60) { // 여기서는 3가지 결과중 1개만 담김
			if(score1< 40) {
				msg.append("1차 시험 재평가\n"); // 개행해서 출력되도록 \n을 붙여줌
			}else if (score2 < 40) {
				msg.append("2차 시험 재평가\n");
			}else {
				msg.append("모두 통과하셨습니다.\n");
			}
		}else { // 여기서는 2가지 결과가 담길 수 있음
			if(score1 < 60) {
				msg.append("1차 시험 재평가\n");
			}
			if(score2 < 60){
				msg.append("2차 시험 재평가\n");
			}
		}
		return msg.toString();
	}

}
