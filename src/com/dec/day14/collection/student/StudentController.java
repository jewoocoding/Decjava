package com.dec.day14.collection.student;

import java.util.InputMismatchException;

// MVC 패턴의 Controller
// View와 Manage는 연결되지 않는다.
// Controller가 View와 Manage를 사용해 프로그램을 실행한다.
public class StudentController {
	public static void main(String[] args) {
		
		StudentManage stdM = new StudentManage();
		StudentView stdV = new StudentView();
		
		end:
		while(true) {
			try {
				switch(stdV.printMenu()) { // 메인메뉴 출력
				case 1 :
					// 학생 정보 입력
					stdM.registerStudent(stdV.inputStudent());
					break;
				case 2 :
					// 학생 검색
					try {
						stdV.displayStudents(stdM.searchOneByName(stdV.inputName("검색")));						
					}catch(NullPointerException e) {
						continue;
					}
					break;
				case 3 :
					// 학생 정보 출력
					stdV.displayStudents(stdM.selectAllStudents());
					break;
				case 4 :
					// 학생 정보 수정
					String modify = stdV.inputName("수정");
					try {
						stdM.modifyStudent(stdM.searchListByName(modify).indexOf(stdM.searchOneByName(modify))
								, stdV.modifyStudent(stdM.searchOneByName(modify)));					
					}catch(NullPointerException e) {
						continue;
					}
					break;
				case 5 :
					// 학생 삭제
					String delete = stdV.inputName("삭제");
					try {
						stdM.deleteStudent(stdM.searchListByName(delete).indexOf(stdM.searchOneByName(delete)));					
					}catch(NullPointerException e) {
						continue;
					}
					break;
				case 6 :
					// 재평가 대상 여부 확인
					String retest = stdV.inputName("재평가 대상 여부 확인");
					try {
						stdV.retestPage(stdM.retest(stdM.searchOneByName(retest)));						
					}catch(NullPointerException e) {
						continue;
					}
					break;
				case 0 :
					// 프로그램 종료
					stdV.displayMsg("프로그램을 종료합니다.");
					break end;
				default : 
					stdV.displayMsg("잘못 입력하셨습니다.");
				}
			}catch(InputMismatchException e) {
				stdV.displayMsg("잘못 입력하셨습니다.");
				stdV.clearSc();
				continue;
			}
			
			

		}
	}
}
