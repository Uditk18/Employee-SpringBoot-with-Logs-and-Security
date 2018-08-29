//Pojo class defining all the instance methods and variables

package com.cg.rest.pojo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Employee {
	
	@Id
	private int empId;
	private String empName;

	public Employee() {
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee Details : /n [empId=" + empId + ", empName=" + empName + "]";
	}

}
