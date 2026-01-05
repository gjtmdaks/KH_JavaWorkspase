package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] a = new int[2];
		int student = 0;
		int employee = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i]!=null) {
				student++;
			}
		}
		for(int i=0; i<e.length; i++) {
			if(e[i]!=null) {
				employee++;
			}
		}
		
		a[0] = student;
		a[1] = employee;
		
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
