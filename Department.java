package com.deloitte.secondmvn.hibfourth.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.CacheModeType;
@Entity
public class Department 
{
	@Id
	int deptno;
	String dname;
	@OneToMany(mappedBy="dept")
	List<Employee> elist;
	public Department() {}
	public Department(int deptno, String dname, List<Employee> elist) 
	{
		this.deptno = deptno;  this.dname = dname;  this.elist = elist;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	
}
