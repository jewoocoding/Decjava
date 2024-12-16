package com.dec.day11.oop.interfacepkg;

public interface PhoneInterface {
	/*
	 * 인터페이스는 상수형 필드만 가능
	 * 추상메소드로만 구성됨(Java 7)
	 */
	public static final int TIME_OUT = 10000;
	// public String name;
	
	public abstract void printLogo();
	
	void sendCall();
	
	public default void showLogo() {
		/*
		 * 디폴트 메소드
		 * 하위 호환성을 위해서 작성하며
		 * 인터페이스 보완이 가능함.
		 */
	}
}
