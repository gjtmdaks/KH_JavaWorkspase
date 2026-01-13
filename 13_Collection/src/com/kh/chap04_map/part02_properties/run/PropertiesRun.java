package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {
	public static void main(String[] args) {
		/*
		 * Properties
		 *  - Map계열 인터페이스를 구현한 클래스로, key,value 쌍으로 값을 저장
		 *  - 단, Properties는 key,value값을 모두 "String"으로 관리하는 것을
		 *    권장하며, 파일입출력메서드(IO)를 지원한다.
		 *  - 주로 프로젝트의 설정정보를 기록하는데 사용된다.
		 */
		
		Properties prop = new Properties();
		
		// Map계열 인터페이스를 구현하였기 때문에 put메서드 사용 가능.
		//prop.put("다이제", new Snack("초코맛", 500));
		
		// 1. setProperty(String, String)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap"); // key값 중복으로 value 삭제
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String key)
		//  - key에 저장된 value값을 가져오는 메서드
		System.out.println(prop.getProperty("Set"));
		
		// 3. store(OutputStream os, String Comments)
		//  - prop에 담긴 key,value를 모두 출력스트림을 활용하여 출력하는 메서드
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 4. load(InputStream is) : properties를 읽어오는데 사용하는 메서드
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		try {
			prop2.load(new FileInputStream("test.properties"));
			
			System.out.println(prop2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
