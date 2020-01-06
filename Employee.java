package com.deloitte.firstmvn.hibsecond;
import java.sql.Date;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	int empid;
	String ename;
	double salary;
	@Column(name="dob")
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
