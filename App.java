package com.deloitte.firstmvn.hibthird;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibthird.entity.HourlyEmployee;
import com.deloitte.firstmvn.hibthird.entity.SalariedEmployee;
public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure();
      SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession();
      SalariedEmployee se = new SalariedEmployee(101,"ajay",1000);
      HourlyEmployee he = new HourlyEmployee(102,"babu",50,42);
      Transaction trans = session.beginTransaction();
      session.save(se);   session.save(he);
      trans.commit();
      session.close();
      factory.close();
    }
}
