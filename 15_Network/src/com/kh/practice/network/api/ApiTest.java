package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		try {
			String serviceKey = "72ff152a05a2fc8ef53612013042debe4859b03193ae372ba0141bd70101aa0d";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dataTerm = "DAILY";
			
			
			serviceUrl += "?serviceKey="+serviceKey
						+ "&stationName="+stationName
						+ "&dataTerm="+dataTerm;
//			String numOfRows = "1000";
//			serviceUrl += "&numOfRows="+numOfRows;
			
			URL url = new URL(serviceUrl);
			
			try(BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									url.openConnection().getInputStream()));){
				
				String line = null;
				while((line = br.readLine()) != null) {
					System.out.println(line);
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
