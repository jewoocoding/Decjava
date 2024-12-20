package com.dec.day18.thread;

public class Exam_Thread2 {
	public static void main(String[] args) {
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
		
		for(int i=5; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
