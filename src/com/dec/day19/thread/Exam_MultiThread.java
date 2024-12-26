package com.dec.day19.thread;

class PrintNumbers implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("숫자 : "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class DownloadFiles implements Runnable {

	@Override
	public void run() {
		String[] files = {"document.pdf","image.jpg","video.mp4"};
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
	public static void main(String[] args) {
		Thread nThread = new Thread(new PrintNumbers());
		Thread dThread = new Thread(new DownloadFiles());
		
		nThread.start();
		dThread.start();
		
	}
}
