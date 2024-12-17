package com.dec.day15.collection.student;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		String name = "";
		int index = 0;
		
		end:
		while(true) {
			
			switch(view.printMenu()) {
			case 1:
				// 학생 등록
				manage.registerStudent(view.inputStudent());
				break;
			case 2:
				// 검색할 이름 입력받으면 Manage stdList에서 검색해서 있는지 확인하고 있다면
				// List 반환후 출력
				view.displayStudents(manage.searchListByName(view.inputName("검색")));
				break;
			case 3:
				// 전체 학생 정보 출력
				view.displayStudents(manage.selectAllStudents());
				break;
			case 4:
				name = view.inputName("수정");
				index = manage.searchIndexByName(name);
				if(index != -1) { // 수정할 데이터가 존재하면 수정할 데이터 입력
					manage.modifyStudent(index, view.modifyStudent(manage.searchOneByName(name))); 
					// 이름으로 저장된 정보를 가져옴 
					// 저장된 정보를 수정해서 리턴해줌 -> 수정할 정보를 stdList에 저장
				}
				break;
			case 5:
				name = view.inputName("삭제"); // 삭제할 이름 입력 받음
				index = manage.searchIndexByName(name); // 이름으로 인덱스 검색해옴. 인덱스로 지우기 때문임
				if(index != -1)
					manage.deleteStudent(index); // 인덱스를 넘겨 remove로 지움
				break;
			case 6:
				name = view.inputName("재평가 여부 확인"); // 재평가 여부 확인할 학생 이름 입력 받음
				view.displayMsg(manage.retest(manage.searchOneByName(name))); // 재평가 여부 출력
				break;
			case 0:
				view.displayMsg("프로그램이 종료되었습니다.");
				break end;
			default:
				view.displayMsg("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
