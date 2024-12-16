package com.dec.day13.oop;

public class StudentController {
	public static void main(String[] args) {
		// 객체 생성
		StudentManage stdManage = new StudentManage();
		StudentView stdView = new StudentView();
		finish :
		while(true) {
			switch(stdView.mainMenu()) { // 메인메뉴 출력
				case 1 :
					// 학생정보를 입력받아 그 객체를 배열에 넣음
					switch(stdManage.getIndex()) {
						case 0, 1, 2 :
							stdManage.insertStudent(stdView.inputStudentData());
							break;
						default : 
							stdView.displayMessage("정원이 꽉 찼습니다!");
							
					}
					break;
				case 2 : 
					// 학생정보 출력
					for(int i =0; i<stdManage.getIndex();i++)
						stdView.printStudentData(stdManage.getStudent()[i]);
					
//					try {
//						for(Student s : stdManage.getStudent())
//							stdView.printStudentData(s);
//					}catch(NullPointerException e) {
//						stdView.displayMessage("아직 입학하지 않은 학생이 있습니다!");
//					}
					break;
				case 3 :
					// 종료 메소드
					stdView.displayMessage("종료합니다.");
					break finish;
				default :
					stdView.displayMessage("잘못 입력하셨습니다.");
			}
		}
	}
}
