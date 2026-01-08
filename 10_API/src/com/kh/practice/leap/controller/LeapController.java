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
		
		long total = 0;
		
		// 1년 ~ 작년까지
		for(int i=1; i<year; i++) {
			if(isLeapYear(i)) {
				total += 366;
			}else {
				total += 365;
			}
			
			//total += isLeapYear(i) ? 366 : 365;
		}
		
		// 올해 저번달 까지
		for(int i=1; i<month; i++) {
			if (i == 2) { // 2월
				if(isLeapYear(year)) {
					total += 29;
				}else {
					total += 28;
				}
	        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
	        	total += 30;
	        } else {
	        	total += 31;
	        }
			
			/*
			switch(i) {
			case 1, 3, 5, 7, 8, 10, 12:
				total += 31;
				break;
			case 4, 6, 9, 11:
				total += 30;
				break;
			case 2:
				total += isLeapYear(i) ? 29 : 28;
				break;
			}
			*/
		}
		
		// 이번달
		total += day;
		
		return total;
	}
}
