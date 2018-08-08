package com.deloitte;

public class Employee {
	int employeeId;
	String employeeName;
	int departmentId;
	
	public Employee()
	{
		
	}
	
	
	public Employee(int employeeId, String employeeName, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departmentId = departmentId;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	
}
