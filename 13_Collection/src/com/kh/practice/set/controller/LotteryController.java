package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean result = false;
		result = lottery.remove(l);
		
		if(result && win != null) {
			win.remove(l);
		}
		return result;
		
		/*
		if (!lottery.isEmpty() && lottery.contains(l)) {
			lottery.remove(l);
			if (!win.isEmpty() && win.contains(l)) {
				win.remove(l);
				winObject();
			}
			return true;
		}
		return false;
		*/
	}

	public HashSet winObject() {
		List<Lottery> list = new ArrayList<>(lottery);
		Collections.shuffle(list);
		
		if(list.size()<4) {
			return null;
		}
		
		for(int i=0; win.size()<4; i++) {
			win.add(list.get(i));
		}
		
		return win;
		
		/*
		ArrayList al = new ArrayList();
		al.addAll(lottery);
		if (lottery.size() >= 4) {
			for (int i = 0; i < 4; i++) {
				if (win.size() == 4)
					return win;
				int random = (int) (Math.random() * al.size());
				Lottery l = (Lottery) al.get(random);
				if (win.contains(l)) {
					i--;
					continue;
				}
				win.add(l);
			}
		}
		return win;
		*/
	}

	public TreeSet sortedWinObject() {
		winObject(); // 당첨자 목록 채우기
		
		TreeSet ts = new TreeSet(new SortedLottery());
		ts.addAll(win);

		return ts;
	}

	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
