package com.deloitte.secondmvn.hibfourth;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hibfourth.entity.Department;
import com.deloitte.secondmvn.hibfourth.entity.Employee;
public class App1 
{
	public static void main(String[] args) 
	{
		 Configuration cfg = new Configuration();
	      cfg.configure();
	      SessionFactory factory = cfg.buildSessionFactory();
	      Session session = factory.openSession();
	      Department d =session.get(Department.class,20);
	      if(d!=null)
	      {
	    	  System.out.println(d.getDeptno()+"  "+d.getDname());
	    	  for(Employee e: d.getElist())
	    		  System.out.println(e.getEmpid()+"   "+e.getEname()+"  "+e.getSalary());
	      }
	      Employee e = session.get(Employee.class,101);
	      if(e!=null)
	      {
	    	  System.out.println(e.getEname()+"  "+e.getSalary());
	    	  System.out.println(e.getDept().getDeptno()+"   "+e.getDept().getDname());
	      }
	      //session.delete(d);
	      
	     /* Department d = session.get(Department.class,20);
	      if(d!=null)
	      {
	    	  System.out.println(d.getDname()+"  "+d.getDeptno());
	    	  for(Employee e:d.getElist())
	    		  System.out.println(e.getEmpid()+"   "+"   "+e.getEname()+"  "+e.getSalary());
	      }
	      Employee e1 = new Employee(101,"Ajay",1000);
	      Employee e2 = new Employee(102,"babu",2000);
	      Employee e3 = new Employee(103,"chandhu",3000);
	      Employee e4 = new Employee(104,"dinesh",4000);
	      ArrayList<Employee> el1 =new ArrayList<Employee>();
	      ArrayList<Employee> el2 =new ArrayList<Employee>();
	      el1.add(e1);   el1.add(e3);
	      el1.add(e2);   el1.add(e4);
	      Department d1 = new Department(10,"sales",el1);
	      Department d2 = new Department(20,"marketing",el1);
	      session.save(e1);   session.save(e2);  session.save(e3);
	      session.save(e4);   session.save(d1);   session.save(d2);*/
	      //session.beginTransaction().commit();
	      session.close();
	      factory.close();
	}
}
