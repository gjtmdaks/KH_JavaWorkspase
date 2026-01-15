package com.kh.chap01_URL.part02_web_cralwer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCralwer {
	
	public static void main(String[] args) {
		WebCralwer wc = new WebCralwer();
		wc.test1();
	}
	/*
	 * URL을 활용한 웹 크롤링
	 *  - 웹페이지를 탐색하여 HTML내부의 원하는 데이터를 추출하는 작업
	 *  - 수집한 데이터를 분석하기위하여 사용한다.
	 *  - 다만 웹페이지의 소유주나 운영자의 허락없이 크롤링시 법적 책임이 따를 수 있다.
	 */
	
	public void test1() {
		String address = "https://khedu.co.kr/project/team.kh";
		List<String> imgList = new ArrayList<>(); // img파일이 존재하는 "경로"를 저장할 컬렉션
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
			
			// 읽어온 데이터를 저장할 StringBuilder
			StringBuilder sb = new StringBuilder();
			
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
			System.out.println(sb.toString());
			
			// 내가 원하는 문자열을 추출하는 방법
			// 정규표현식
			// <img src="???">
			String regex = "<img\s+src=\"([^\"]+)\"";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(sb);
			
			while(matcher.find()) {
				String image = matcher.group(1);
				System.out.println(image);
				imgList.add(image);
			}
			System.out.println("검색 완료");
			
			saveFile(imgList);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void saveFile(List<String> imgList) {
		// imgList의 길이만큼 반복하여, URL객체를 생성하고, 이미지를 다운로드
		for(String imgPath : imgList) {
			
			if(imgPath.startsWith("/upload/project")) {
				continue;
			}
			
			// /resources/images/main/main_renewal/arrow_icon_bottom.png
			// 뒤쪽 /arrow_icon_bottom.png 파일이름 추출
			String fileName = imgPath.substring(imgPath.lastIndexOf("/"));
			String savePath = "C:/upload/kh/project/";
			
			File dir = new File(savePath);
			if(!dir.exists()) { // 폴더가 없으면
				dir.mkdirs(); // 폴더들 생성
			}
			
			try {
				URL url = new URL("https://khedu.co.kr"+imgPath);
				URLConnection conn = url.openConnection();
				
				try(BufferedInputStream is = 
						new BufferedInputStream(conn.getInputStream());
					BufferedOutputStream os = 
							new BufferedOutputStream(
									new FileOutputStream(dir+fileName));){
					
					int value = 0;
					while((value = is.read()) != -1) {
						os.write(value);
					}
					System.out.println(fileName+"저장완료");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
