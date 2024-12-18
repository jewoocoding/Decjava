package com.dec.project.mini;

public class PokerController {
	public static void main(String[] args) {
		PokerView view = new PokerView();
		// 초기 자본금 입력받고 manage객체 생성
		PokerManage manage = new PokerManage();
		// 본인 정보 입력 -> 인덱스 0번째에 나의 정보를 저장
		manage.pushPlayer(view.setMe());
		end:
		while(true) {
			switch(view.printMenu()) {
			case 1:
				// 같이 플레이할 인원설정해 playerList에 추가
				manage.pushPlayer(view.setPlayer());
				// 입장료
				view.printEnter(manage.enter(5000));
				// 플레이어 정보 출력
				view.printPlayerInfor(manage.getPlayerList());
				// 카드 나눠줌
				for(int i=0;i<4;i++) {
					manage.giveCard();				
				}
				// 내 카드 출력
				view.printMyCards(manage.getPlayerList());
				// 컴퓨터가 무슨 카드를 테이블에 올려놓을지 선택
				manage.selectShowCard();
				// 나는 무슨 카드를 올려놓을지 선택
				view.selectMyShowCard(manage.getPlayerList());
				// 테이블 출력
				view.printTable(manage.getPlayerList());	
				
				// 베팅
				
				for(int i=0;i<2;i++) {
					// 공개할 카드 지급
					manage.giveShowCard();
					// 테이블 출력
					view.printTable(manage.getPlayerList());
					
					// 베팅
					
				}
				manage.giveCard();
				view.printMyCards(manage.getPlayerList());
				
				// 마지막 베팅
				
				// 게임결과 출력 
				
				break;
			case 2:
				// 나의 객체의 money를 출력
				view.printMoney(manage.getPlayer(0).getMoney());
				break;
			case 3:
				// 전적 출력
				view.printScore(manage.getWin(), manage.getLose());
				break;
			case 4:
				// 프로그램 종료
				view.displayMessage("프로그램을 종료합니다.");
				break end;
			default:
				// 다른 숫자를 입력했을 때 출력
				view.displayMessage("메뉴에 있는 숫자를 입력해주세요.");
				continue;
			}
		}
		
		
	}
}
