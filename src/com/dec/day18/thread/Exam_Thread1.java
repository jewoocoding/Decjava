package com.dec.day18.thread;

// 카운트업 쓰레드가 됨.
class CountUp extends Thread {
	// Thread클래스를 상속받아
	// run 메소드로 스레드를 생성해 실행시킴
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				// 전달값으로 밀리초를 받음, 1ms = 1/1000초, 1000ms는 1초
				// Thread.sleep()는 Checked Exception이라 반드시 예외처리를 해줘야함
				Thread.sleep(500); // Checked Exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}

class CountDown extends Thread {
	@Override
	public void run() {
		for(int i=69; i>=65; i--) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam_Thread1 {
	public static void main(String[] args) {
		
		CountUp cUp = new CountUp();
		CountDown cDown = new CountDown();
		
		// start메소드로 스레드 실행시킴
		cUp.start();
		cDown.start();
		
	}
}
