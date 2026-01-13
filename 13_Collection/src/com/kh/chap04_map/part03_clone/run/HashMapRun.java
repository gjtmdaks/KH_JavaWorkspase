package com.kh.chap04_map.part03_clone.run;

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
			} else {
				// 2. key값은 다르지만 hash값이 우연히 일치한 경우
				table[index].next = new Entry<>(key, value, null);
			}
		}
	}
	
	public V get(K key) {
		
	}

	public boolean containsKey(String key) {
		
	}

	public void remove(String key) {
		
	}

	public int size() {
		
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

	}
}
