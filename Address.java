package com.deloitte.thirdmvn.firstspringapp.beans;
public class Address 
{
	String hno;
	String city;
	String state;
	public Address() {}
	public Address(String hno, String city, String state) 
	{
		this.hno = hno;   this.city = city; this.state = state;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
