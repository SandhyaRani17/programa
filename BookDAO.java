package com.spring.casestudy.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.casestudy.Book;
@Repository
public class BookDAO 
{
	SessionFactory sessionFactory;
	@Autowired
	public BookDAO(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	public void insertBook(Book b)
	{
		Session session = sessionFactory.openSession();
		session.save(b);
		session.beginTransaction().commit();
	}
	public void deleteBook(int bookid)
	{
		Session session = sessionFactory.openSession();
		Book b =session.get(Book.class,bookid);
		session.delete(b);
	    session.beginTransaction().commit();
	}
	public void modifyBook(Book b)
	{
		Session session = sessionFactory.openSession();
		Book b1 = session.get(Book.class,b.getBookid());
		b1.setBookname(b.getBookname()); b1.setPrice(b.getPrice());
		b1.setAuthor(b.getAuthor());
		session.beginTransaction().commit();
	}
	public Book getBook(int bookid)
	{
		Session session = sessionFactory.openSession();
		return session.get(Book.class,bookid);
	}
	
}
