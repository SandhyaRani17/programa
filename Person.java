package com.deloitte.thirdmvn.firstspringapp.beans;
public class Person 
{
	int ssn;
	String name;
	Address address;
	public Person() {}
	public Person(int ssn, String name, Address address) 
	{
		this.ssn = ssn;  this.name = name; this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
