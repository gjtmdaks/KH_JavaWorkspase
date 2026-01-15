package com.kh.chap01_URL.part03_request;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class AirPolution {
	public static void main(String[] args) {
		/*
		 * 1) API서버로 데이터 요청(Request)
		 * 
		 * 1. API(Application Programming Interface)
		 *  - 어플리케이션간에 상호작용을 위한 인터페이스
		 *  
		 *  - 자바 api : 자바 어플리케이션 개발에 도움을 주는 클래스
		 *  
		 *  - API 서버
		 *     - URL로 데이터에 대한 요청을 보내면 응답데이터를 반환해주는 서버로, 어플리케이션들 중
		 *       데이터나 서비스를 제공하는 역할을 API서버라고 부른다(카카오 API서버, 네이버 API서버 등)
		 *     - A어플리케이션이 B어플리케이션에 필요한 데이터가 있는 경우, B어플리케이션의 API서버를 통해
		 *       요청(request)를 보내고, B API서버는 요청에 대한 응답(response)을 돌려준다.
		 *     - 단, API서버 요청시에는 해당 API서버가 정한 규칙(interface)에 맞춰 요청을 보내야 한다.
		 * 
		 * 2. API 서버 요청 방식(Http Method)
		 *  - API서버에서 지정한 규칙에 따라야 하며, 전통적인 방식의 API요청방법은 2가지가 있다.
		 *  1) Get방식
		 *   - URL에 요청변수(queryParameter)를 붙여서 요청하는 방식
		 *   - 요청변수는 key=value형태로 작성하며 여러개의 요청변수가 있을 경우 &로 구분한다.
		 *   - get방식은 주로 데이터를 단순히 조회할때 사용한다.
		 *   - ex) https://khedu.co.kr/project/teamView.kh?no=3393&cpage=51
		 *  
		 *  2) Post방식
		 *   - 요청변수를 HTTP바디에 담아서 요청하는 방식
		 *   - 주로 데이터를 생성, 수정, 삭제할때 사용한다.
		 *   - ex) https://khedu.co.kr/data (쿼리스트링은 url에 노출되지 않는다)
		 * 
		 * 3. API응답데이터 형식 및 처리방법
		 *  1) XML유형의 데이터
		 *    <course>
		 *    	// ...
		 *    </course>
		 *    
		 *  2) JSON유형의 데이터(표준)
		 *    { "name" : "mkm" } // 문자열 형태의 javascript 객체
		 *  
		 *  3) 처리방법
		 *   - xml , json등 해당 타입에 맞는 파서를 이용하여 내 프로그래밍언어에 맞는 객체로 변환한다.
		 * 
		 * 4. API 응답 상태코드
		 *  - 200 : 성공
		 *  - 404 : 찾고자하는 자원이 없는 경우 전달하는 상태값
		 *  - 400 : 요청 오류시 전달하는 상태값
		 *  - 401 : 인증 오류시 전달하는 상태값
		 *  - 500 : API서버상의 오류가 발생한 경우 전달하는 상태값
		 */
		
			try {
				String serviceKey = "72ff152a05a2fc8ef53612013042debe4859b03193ae372ba0141bd70101aa0d";
				String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
				
				serviceUrl += "?serviceKey="+serviceKey;
				serviceUrl += "&sidoName=" + URLEncoder.encode("서울","UTF-8");
				System.out.println(serviceUrl);
				
				URL url = new URL(serviceUrl);
				URLConnection conn = url.openConnection();
				
				try(BufferedReader br = 
						new BufferedReader(
								new InputStreamReader(conn.getInputStream()));
					BufferedWriter bw = 
							new BufferedWriter(
									new FileWriter("환경오염.xml"));){
					
					String line = null;
					while((line = br.readLine()) != null) {
						bw.write(line);
						bw.newLine();
					}
				} 
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
