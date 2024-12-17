package com.dec.project.mini;

import java.util.*;

import javax.crypto.Mac;

public class Player {
	// 필드
	private String name;
	private int money;
	private List<Card> myCard;
	private List<Card> showCard;
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void getCard(Card card) {
		myCard.add(card);
	}
	public int getMyCardCount() {
		return myCard.size();
	}
	public List<Card> getMyCard() {
		return myCard;
	}
	public void setShowCard(int index) {
		showCard.add(myCard.get(index)); // 여기서 오류
		myCard.remove(index);
	}
	public List<Card> getShowCard() {
		return showCard;
	}
	// 생성자
	public Player() {}
	public Player(String name, int money) {
		this.name = name;
		this.money = money;
		myCard = new ArrayList<Card>();
		showCard = new ArrayList<Card>();
	}
}
