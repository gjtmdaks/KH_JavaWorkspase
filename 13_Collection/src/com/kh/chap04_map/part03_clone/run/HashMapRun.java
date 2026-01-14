package com.kh.chap04_map.part03_clone.run;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class HashMapRun<K, V> {
	private Entry<K, V>[] table;
	private int capacity; // 객체배열의 크기로써 사용
	private int size; // 객체배열 내부의 초기화된 객체의 수

	class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	// 객체 생성시 반드시 객체배열의 크기를 지정
	public HashMapRun(int capacity) {
		this.capacity = capacity;
		this.table = new Entry[capacity];
	}

	public int getIndex(K key) {
		int hash = key.hashCode();
		/*
		 * 저장공간이 10이라면?
		 * 113355 % 10 == 5번 인덱스
		 * 12345678 % 10 == 8번 인덱스
		 */
		return Math.abs(hash) % capacity;
	}
	
	public void put(K key, V value) {
		int index = getIndex(key);
		
		if(table[index] == null) {
			table[index] = new Entry<>(key, value, null);
		}else {
			// 이미 해당 위치에 값이 있는 경우.
			// 1. 완전 같은 key값을 사용한 경우
			//  - key값 중복으로 현재 들어온 value로 인덱스위치의 값을 덮어씌우기.
			if(table[index].key.equals(key)) {
				table[index].value = value;
				return;
			} else {
				// 2. key값은 다르지만 hash값이 우연히 일치한 경우
				// table[index].next = new Entry<>(key, value, null);
				
				Entry<K,V> next = table[index];
				while(true) {
					// 다음으로 뽑은 entry의 key값이 현재 전달받은 key값과 동일한 경우(중복)
					if(next.key.equals(key)) {
						next.value = value;
						return;
					}
					
					// 현재 entry가 마지막 entry인 경우
					if(next.next == null) {
						next.next = new Entry<>(key, value, null);
						break;
					}
					
					next = next.next;
				}
			}
		}
		size++;
	}
	
	public V get(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];
		
		if(entry == null) {
			return null;
		}
		
		while(true) {
			if(entry == null) {
				return null;
			}
			
			if(entry.key.equals(key)) {
				return entry.value;
			}
			
			entry = entry.next;
		}
	}

	public boolean containsKey(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];
		
		if(entry == null) {
			return false;
		}
		
		do {
			if(entry.key.equals(key)) {
				return true;
			}
			entry = entry.next;
		} while(entry != null);
		
		return false;
	}

	public void remove(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];
		
		if(entry == null) {
			return;
		}
		
		// 이전 entry값을 보관하기 위한 변수
		Entry<K,V> prev = null;
		do {
			if(entry.key.equals(key)) {
				// 첫번째 entry인 경우 table의 index를 통해 삭제
				if(table[index] == entry) {
					table[index] = null;
				}else {
					// 두번째 이상의 entry인 경우 next필드의 값을 null로 변경하여 삭제
					prev.next = entry.next;
				}
				size--;
				break;
			}
			prev = entry;
			entry = entry.next;
			
		} while(entry != null);
	}

	public int size() {
		return size;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (Entry e : table) {
			if (e == null)
				continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");

			Entry next = e.next;
			do {
				if (next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
					next = next.next;
				}
			} while (next != null); //
		}
		// sb.append(Arrays.toString(table));

		sb.append('}');

		return sb.toString();
	}

	public static void main(String[] args) {
		HashMapRun<String, Snack> hm = new HashMapRun<>(10);
		
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm.get("새우깡")); // 출력 : 짠맛, 500원
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm.get("새우깡")); // 출력 : 매운맛, 700원
		
		System.out.println(hm.containsKey("새우깡")); // 출력 : true
		System.out.println(hm.size()); // 출력 : 4
		
		hm.remove("포테이토칩");
		
		System.out.println(hm.containsKey("포테이토칩")); // 출력 : false
		System.out.println(hm.size()); // 출력 : 3
	}
}
