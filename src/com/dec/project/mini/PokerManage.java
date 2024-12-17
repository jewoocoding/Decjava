package com.dec.project.mini;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PokerManage {
	// 필드
	private List<Card> cardDeck;
	private List<Player> playerList;
	private int win;
	private int lose;
	private int bettingMoney;
	
	// 메소드
	// getter/setter
	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}
	// 생성자
	public PokerManage() {
		cardDeck = new ArrayList<Card>(); // 트럼프 카드덱 생성
		for(int i=1;i<=13;i++) {
			Card card = new Card(i, "Spade");
			cardDeck.add(card);
		}
		for(int i=1;i<=13;i++) {
			Card card = new Card(i, "Diamond");
			cardDeck.add(card);
		}
		for(int i=1;i<=13;i++) {
			Card card = new Card(i, "Clover");
			cardDeck.add(card);
		}
		for(int i=1;i<=13;i++) {
			Card card = new Card(i, "Heart");
			cardDeck.add(card);
		}
		playerList = new ArrayList<Player>(); // 게임을 할 플레이어 리스트 생성
		// 전적 초기화
		win = 0;
		lose = 0;
		// 배팅액 변수 초기화
		bettingMoney = 0;
	}
	// 플레이어를 playerList에 추가
	public void pushPlayer(Player player) {
		playerList.add(player);
	}
	// 인덱스에 있는 플레이어 리턴
	public Player getPlayer(int index) {
		return playerList.get(index);
	}
	
	// 플레이어 인원 설정
	public void pushPlayer(int player) {
		for(int i=0; i<player-1;i++) {
			// 같이 플레이할 컴퓨터 플레이어 생성
			int num = i+1;
			playerList.add(new Player("com"+num,(int)(Math.random()*400000+100000)));
		}
	}
	// 플레이어 리스트 리턴
	public List<Player> getPlayerList(){
		return playerList;
	}
	

	public void giveCard() {
		// cardDeck에 있는 카드를 player의 카드리스트에 넣고
		// 그 카드를 cardDeck에서 제거
		for(int i=0;i<playerList.size();i++) {
			// 랜덤으로 카드를 뽑는다.
			int random = (int)(Math.random()*cardDeck.size());
			playerList.get(i).getCard(cardDeck.get(random));
			cardDeck.remove(random);
		}
	}
	public void giveShowCard() {
		// cardDeck 에서 카드 뽑아서 테이블에 전시
		for(int i=0;i<playerList.size();i++) {
			// 랜덤으로 카드를 뽑는다.
			int random = (int)(Math.random()*cardDeck.size());
			playerList.get(i).getCard(cardDeck.get(random));
			playerList.get(i).setShowCard(playerList.get(i).getMyCard().size()-1);
			cardDeck.remove(random);
		}
	}
	// 테이블 위에 공개할 카드 선택
	public void selectShowCard() {
		for(int i = 1;i<playerList.size();i++) {
			int rand = (int)(Math.random()*playerList.get(i).getMyCardCount());
			playerList.get(i).setShowCard(rand);
		}
	}
	// 나의 공개할 카드 선택
	public void selectShowCard(int index) {
		Player me = playerList.get(0);
		me.setShowCard(index);
	}
	// 입장료 지급
	public int enter(int enter) {
		for(int i=0;i<playerList.size();i++) {
			bettingMoney += enter;
			playerList.get(i).setMoney(playerList.get(i).getMoney()-enter);
		}
		return enter;
	}
	// 베팅
	public void betting(Player player, int bet) {
		bet = player.getMoney();
		bettingMoney += bet;
		player.setMoney(player.getMoney()-bet);
	}

}
