package com.dec.day2x.enumex;

public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	// 주중, 주말 체크하는 메소드
	public boolean isWeekEnd() {
		// SATURDAY, SUNDAY면 true 반환
		return this == SATURDAY || this == SUNDAY;
	}
}
