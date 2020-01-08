package com.deloitte.secondmvn.hibfourth;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hibfourth.entity.Student;
import com.deloitte.secondmvn.hibfourth.entity.Courses;
import com.deloitte.secondmvn.hibfourth.entity.Employee;
public class App2 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Courses.class);
		cfg.addAnnotatedClass(Student.class);
	      cfg.configure();
	      SessionFactory factory = cfg.buildSessionFactory();
	      Session session = factory.openSession();
	     /* Query qry = session.createQuery("from Employee");
	      List<Employee> elist = qry.list();
	      for(Employee e : elist)
	    	  System.out.println(e.getEmpid()+"  "+e.getEname()+"   "+e.getSalary());*/
	      Courses c = session.get(Courses.class, 7001);
	      if(c!=null)
	      {
	    	  System.out.println(c.getCname()+"   "+c.getDuration());
	    	  for(Student s : c.getSlist())
	    		  System.out.println(s.getSid()+"  "+s.getSname()+"  "+s.getAddress());
	      }
	      Student s =session.get(Student.class,103);
	      if(s!=null)
	      {
	    	  System.out.println(s.getSname()+"  "+s.getAddress());
	    	  for(Courses c1 : s.getClist())
	    		  System.out.println(c1.getCid()+"  "+c1.getCname()+"  "+c1.getDuration());
	      }
	      session.close();
	      factory.close();

	}

}
