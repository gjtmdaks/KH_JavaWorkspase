package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] a = new int[2];
		int count = 0;
		for(Student std : s) {
			if(std!=null) {
				count++;
			}
		}
		a[0] = count;
		
		count = 0;
		for(Employee emp : e) {
			if(emp!=null) {
				count++;
			}
		}
		a[1] = count;
		
		return a;
	}
	
	public void insertStudent(String name, int age, double height,
						double weight, int grade, String major) {
		Student a = new Student(name, age, height, weight, grade, major);
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = a;
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height,
						double weight, int salary, String dept) {
		Employee a = new Employee(name, age, height, weight, salary, dept);
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = a;
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
