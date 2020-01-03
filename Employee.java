package com.del.second.entity;
import java.sql.Date;
public class Employee
{
	int empid;
	String ename;
	double salary;
	Date doj;
	public Employee() {}
	public Employee(int empid, String ename, double salary,Date doj) 
	{
		this.empid = empid; this.ename = ename; this.salary = salary;
		this.doj=doj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}	
}