package com.dec.day2x.innerclass;

public class PocketBall {
	static int size = 100;
	static int price = 5000;
	
	void showPokemonster() {
		int exp = 4000;
		
		// 메소드 안에 존재하는 로컬 클래스
		class PokeMonster {
			static String name = "꼬부기";
			static int level = 100;
			
			public void getPokeLevel() {
				System.out.println(level);
				System.out.println(exp);
			}
		}
	}
	
	// static이 아닌 경우 외부와 연결되어 있는 외부 참조를 갖게됨.
	// 메모리가 더 사용되고 느려지므로 static 권장
	class PocketMonster {
		String name = "이상해씨";
		int level = 100;
		// static 멤버변수 선언하려면 final키워드를 붙여야함?
		static final int cost = 1000; // 인스턴스 클래스 내부에서는 static final 상수만 선언 가능
		
		public void getPocketMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
			System.out.println(size);
			System.out.println(price);
		}
	}
	
	// static 클래스로 쓰기를 권장
	static class PocketMonster2 {
		String name = "이상해씨";
		int level = 100;
		// static 멤버변수 선언하려면 final키워드를 붙여야함 -> jdk16부터는 그냥 static 변수만 선언가능
		static final int cost2 = 1000; // 인스턴스 클래스 내부에서는 static final 상수만 선언 가능
		static int cost3 = 1000; // jdk16부터 가능
		
		public void getPocketMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost2);
			
			System.out.println(size);
			System.out.println(price);
		}
	}
	
	public static void main(String[] args) {
		PocketBall ball = new PocketBall(); // outer클래스 객체 생성
		PocketBall.PocketMonster pokemon = ball.new PocketMonster(); // 이너클래스 객체 생성
		// 									 new PocketBall.PocketMonster2(); -> 원래 이렇게 하지만 jdk16부터 밑의 형태로 가능
		PocketBall.PocketMonster2 pokemon2 = new PocketMonster2(); // 스태틱이너클래스 객체 생성
		pokemon.getPocketMember();
		pokemon2.getPocketMember();
	}
}
