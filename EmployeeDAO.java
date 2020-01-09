package com.spring.web.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.web.entity.Employee;
@Repository
public class EmployeeDAO 
{
	SessionFactory sessionFactory;
	@Autowired
	public EmployeeDAO(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	public void insertEmployee(Employee e)
	{
		Session session = sessionFactory.openSession();
		session.save(e);
		session.beginTransaction().commit();
	}
	public void deleteEmployee(int empid)
	{
		Session session = sessionFactory.openSession();
		Employee e =session.get(Employee.class,empid);
		session.delete(e);
	    session.beginTransaction().commit();
	}
	public void modifyEmployee(Employee e)
	{
		Session session = sessionFactory.openSession();
		Employee e1 = session.get(Employee.class,e.getEmpid());
		e1.setEname(e.getEname()); e1.setSalary(e.getSalary());
		session.beginTransaction().commit();
	}
	public Employee getEmployee(int empid)
	{
		Session session = sessionFactory.openSession();
		return session.get(Employee.class,empid);
	}
	
	
}

