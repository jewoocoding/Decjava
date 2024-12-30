package com.dec.day2x.enumex;

enum DevelType {
	MOBILE, WEB, SERVER, FULLSTACK, FRONTEND, BACKEND
}

public class Developer {
	private String name;
	private long salary;
	// Enum으로 타입지정 가능
	// private DeveloperType type;
	private enum DevType{
		MOBILE, FRONTEND, BACKEND
	}
}
