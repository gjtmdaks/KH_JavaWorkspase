package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	public void fileSave() {
		// 파일에 저장할 객체
		Phone p = new Phone("아이폰",1300000,"1234");
		
		// ObjectOutputStream : 객체단위 출력을 지원하는 보조 스트림
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream("phone.txt"));) {
			
			// 객체단위 출력메서드
			// writeObject(p);
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream("phone.txt"));){
			
			Phone p = (Phone)ois.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
