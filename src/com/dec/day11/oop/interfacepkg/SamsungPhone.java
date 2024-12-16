package com.dec.day11.oop.interfacepkg;

// implements - 예약어
public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		System.out.println("SAMSUNG");
	}

	@Override
	public void sendCall() {
		System.out.println("전화 왔어여");
	}
	
	public static void main(String[] args) {
		
		SamsungPhone sPhone = new SamsungPhone();
		sPhone.printLogo();
		sPhone.sendCall();
		// Cannot instantiate the type PhoneInterface
		// 인터페이스의 인스턴스 생성불가
		// PhoneInterface phone = new PhoneInterface();
		
		// 업캐스팅하여 사용
		PhoneInterface upCastingPhone = new SamsungPhone();
		// 동적바인딩 동작
		upCastingPhone.printLogo();
		upCastingPhone.sendCall();
		
	}

}
