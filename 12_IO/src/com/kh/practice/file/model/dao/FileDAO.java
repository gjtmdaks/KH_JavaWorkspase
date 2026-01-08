package com.kh.practice.file.model.dao;

import java.io.File;

public class FileDAO {
	public boolean checkName(String file) {
		// 중복파일이 있으면 true
		File f = new File(file);
		
		return f.exists() && f.isFile();
	}
	
	public void fileSave(String file, String s) {
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = null;
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
