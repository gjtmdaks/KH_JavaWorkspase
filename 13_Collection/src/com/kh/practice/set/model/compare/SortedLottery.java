package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator {
	public int compare(Object o1, Object o2) {
		Lottery l1 = (Lottery) o1;
		Lottery l2 = (Lottery) o2;

		int result = l1.getName().compareTo(l2.getName());
		if (result == 0) {
			result = l1.getPhone().compareTo(l2.getPhone());
		}

		return result;
	}
}
