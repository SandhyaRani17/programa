import java.sql.*;
public class Student
{
	int rno;
	String name;
	int age;
	Date dob;
	public Student(int rno, String name, int age, Date dob) 
	{
		this.rno = rno;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
