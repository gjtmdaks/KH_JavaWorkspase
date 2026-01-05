package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e;	// Employee e = new Employee(); 하면 기본적인 0 null null null null 0 0.0 데이터 생성됨

	// 입력받은 데이터를 객체로 저장
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
	}
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	// setter로 정보 수정
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	// 객체 삭제
	public Employee remove() {
		Employee temp = e;	// e가 참조하던 객체를 temp가 함께 참조
							// e -----ㄱ
							// temp-----> 객체
		
		e = null;			// e의 참조를 끊음 (객체 삭제 아님)
							// e ----> null
							// temp-----> 객체
		
		return temp;		// 객체의 참조를 반환(Menu에서 반환값이 있으면 삭제할 데이터가 존재,
							// 					반환값이 null이면 데이터자체가 없어서 삭제 불가)
		// 필드 e에 저장된 Employee 객체를 꺼내서 반환하고,
		// 내부 저장소에서는 비우는 역할
	}

	// 데이터 출력
	public String inform() {
		if (e == null) { // 사원 데이터가 없으면
			return null; // null사원 데이터가 없습니다 반환
		}
		return e.printEmployee();
	}
}
