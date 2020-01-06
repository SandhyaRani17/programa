package com.deloitte.firstmvn.hibsecond;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibsecond.Employee;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Employee emp=new Employee(108,"sravani",5000,new Date(2020,1,5));
        Session session=factory.openSession();
        Transaction trans = session.beginTransaction();
        session.save(emp);
        trans.commit();
        session.close();
        factory.close();
        
    }
}
