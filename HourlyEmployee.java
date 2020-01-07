package com.deloitte.firstmvn.hibthird.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("Hourly")
@Entity
public class HourlyEmployee extends Employee 
{
	double rate;
	int hours;
	public HourlyEmployee() {}
	public HourlyEmployee(int empid, String ename,double rate,int hours)
	{
		super(empid, ename);  this.rate=rate;  this.hours=hours;
		
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}
