package com.deloitte.secondmvn.hibfourth.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Courses
{
	@Id
	int cid;
	String cname;
	int duration;
	@ManyToMany
	@JoinTable(name="student_course_reg",joinColumns= {@JoinColumn(name="cid")},inverseJoinColumns= {@JoinColumn(name="sid")})
	List<Student> slist;
	public Courses() {}
	public Courses(int cid, String cname, int duration) 
	{
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
}
