package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		// 중복파일이 있으면 true
		File f = new File(file);
		
		return f.exists() && f.isFile();
	}
	
	public void fileSave(String file, String s) {
		FileWriter f = null;
		
		try {
			f = new FileWriter(file); // 파일이 없다면 생성
			f.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		FileReader f = null;
		
		try {
			f = new FileReader(file);
			
			int value = 0;
			while((value = f.read()) != -1) {
				sb.append((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		FileWriter f = null;
		
		try {
			f = new FileWriter(file, true); // 이어쓰기.
			f.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
