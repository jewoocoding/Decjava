package com.dec.day18.thread;

class printNumbers implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("숫자 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class downloadFiles implements Runnable {

	@Override
	public void run() {
		String [] files = {"document.pdf", "image.jpg", "video.mp4"};
		for(String file : files) {
			System.out.println(file+" 다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam_MultiThread {
	public static void main(String[] args) { // main메소드도 쓰레드
		// 싱글쓰레드의 경우 순차적으로 실행됨
		// - 한 작업이 완전히 끝나야 다음 작업 시작
		Thread thread1 = new Thread(new printNumbers());
		Thread thread2 = new Thread(new downloadFiles());
		
		thread1.start();
		thread2.start();
		
	}
}
