package com.dec.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		// 그레고리안 달력, 이슬람력, 유대력, 태음력
		Calendar calendar = new GregorianCalendar();
		Calendar today = Calendar.getInstance(); // 객체 생성해주는 메소드
		Calendar startDate = Calendar.getInstance();
		startDate.set(2024, 10, 18);
		startDate.set(Calendar.HOUR_OF_DAY, 9);
		startDate.set(Calendar.MINUTE, 10);
		printDate(startDate, "개강날짜는 ");
		printDate(calendar, "지금은 ");
		// 지금은 2024/12/12/목요일(16시) 오전 4시 31분 30초 30밀리초에 개강하였습니다.
		// 2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다.
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println((today.get(Calendar.MONTH)+1)+"월");
//		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		System.out.println(today.get(Calendar.HOUR)+"시");
//		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시");
//		System.out.println(today.get(Calendar.MINUTE)+"분");
//		System.out.println(today.get(Calendar.SECOND)+"초");
//		System.out.println(today.get(Calendar.AM_PM));
	}
	
	public static void printDate(Calendar date, String content) {
		// date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		// 요일
		int day = date.get(Calendar.DATE);
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		String dayOfWeekKor = "";
		int hour = date.get(Calendar.HOUR);
		int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millisec = date.get(Calendar.MILLISECOND);
		int ampm = date.get(Calendar.AM_PM);
		String ampmKor = "";	
		
		dayOfWeekKor = weekOfDayKor(dayOfWeek);
		ampmKor = amPmKor(ampm);
		
		
		System.out.println(content+year+"/"+month+"/"+day+"/"+dayOfWeekKor
				+"("+hourOfDay+"시)"+" "+ampmKor+" "+hour+"시 "+minute+"분 "
				+millisec+"초밀리초입니다.");
		
	}
	
	public static String weekOfDayKor(int dayOfWeek) {
		
		String dayOfWeekKors = "";
		switch(dayOfWeek) {
		case Calendar.SUNDAY :
			dayOfWeekKors = "일요일";
			break;
		case Calendar.MONDAY :
			dayOfWeekKors = "월요일";
			break;
		case Calendar.TUESDAY :
			dayOfWeekKors = "화요일";
			break;
		case Calendar.WEDNESDAY :
			dayOfWeekKors = "수요일";
			break;
		case Calendar.THURSDAY :
			dayOfWeekKors = "목요일";
			break;
		case Calendar.FRIDAY :
			dayOfWeekKors = "금요일";
			break;
		default :
			dayOfWeekKors = "토요일";
		}
		return dayOfWeekKors;
	}
	
	public static String amPmKor(int ampm) {
		String ampmKors = "";
		switch(ampm) {
		case Calendar.AM :
			ampmKors = "오전";
			break;
		default :
			ampmKors = "오후";
			
		}
		return ampmKors;
	}
}
