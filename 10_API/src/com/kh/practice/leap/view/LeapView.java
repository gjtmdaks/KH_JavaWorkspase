package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		LeapController lc = new LeapController();
		Calendar c = new GregorianCalendar(/*2019,3,15*/);
		int year = c.get(Calendar.YEAR);
		
		String str = lc.isLeapYear(year) ? "윤년" : "평년";
		System.out.println(year+"년은 "+str+"입니다.");
		
		long total = lc.leapDate(c);
		System.out.println("총 날짜 수 : "+total);
	}
}
