package com.spring.web.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.web.entity.Users;
@Repository
public class UsersDAO 
{
	SessionFactory sessionfactory;
	@Autowired
	public UsersDAO(SessionFactory sessionfactory)
	{
		this.sessionfactory = sessionfactory;
	}
	public boolean searchUser(Users u)
	{
		Session session = sessionfactory.openSession();
		Query qry = session.createQuery("from Users u where u.username=? and u.password=?");
		qry.setString(0,u.getUsername());     qry.setString(1,u.getPassword());
		return qry.list().size()>0;
	}
	
}
