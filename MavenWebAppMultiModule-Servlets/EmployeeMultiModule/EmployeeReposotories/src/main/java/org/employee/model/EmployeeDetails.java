package org.employee.model;

import java.sql.Date;

public class EmployeeDetails {
	private int employeeNo;
	private Date birthDate;
	private String firstNAme;
	private String lastName;
	private String gender;
	private Date hireDate;
	private Double salary;
	private Date fromdate;
	private Date todate;
	private String deptnumber;
	private String deptname;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public String getDeptnumber() {
		return deptnumber;
	}
	public void setDeptnumber(String deptnumber) {
		this.deptnumber = deptnumber;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getFirstNAme() {
		return firstNAme;
	}
	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public EmployeeDetails(int employeeNo, String firstNAme, String lastName, String gender) {
		super();
		this.employeeNo = employeeNo;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
	}
	public EmployeeDetails(String firstNAme, String lastName, String gender) {
		super();
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
	}
	public EmployeeDetails(int employeeNo, Date birthDate, String firstNAme, String lastName, String gender, Date hireDate) {
		super();
		this.employeeNo = employeeNo;
		this.birthDate = birthDate;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}
	public EmployeeDetails(int employeeNo, Date birthDate, String firstNAme, String lastName, String gender,
			Date hireDate, Double salary, Date fromdate, Date todate, String deptnumber, String deptname) {
		super();
		this.employeeNo = employeeNo;
		this.birthDate = birthDate;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salary = salary;
		this.fromdate = fromdate;
		this.todate = todate;
		this.deptnumber = deptnumber;
		this.deptname = deptname;
	}
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int employeeNo, String firstNAme, String lastName, String gender, Date hireDate,
			String deptname,Double salary) {
		super();
		this.employeeNo = employeeNo;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salary = salary;
		this.deptname = deptname;
	}
	
	
	
	


	
}