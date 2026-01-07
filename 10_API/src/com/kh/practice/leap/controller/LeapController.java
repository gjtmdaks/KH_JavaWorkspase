package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		return ((year%4==0) && (year%100!=0)) || (year%400==0);
	}
	
	public long leapDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		int count = 0;
		
		// 1년 ~ 작년까지
		for(int i=1; i<year; i++) {
			if(isLeapYear(i)) {
				count += 366;
			}else {
				count += 365;
			}
		}
		
		// 올해 저번달 까지
		for(int i=1; i<month; i++) {
			if (i == 2) { // 2월
				if(isLeapYear(year)) {
					count += 29;
				}else {
					count += 28;
				}
	        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
	            count += 30;
	        } else {
	            count += 31;
	        }
		}
		
		// 이번달
		count += day;
		
		return count;
	}
}
