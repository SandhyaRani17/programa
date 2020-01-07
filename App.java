package com.deloitte.secondmvn.hibfourth;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hibfourth.entity.AadharCard;
import com.deloitte.secondmvn.hibfourth.entity.Person;
public class App 
{
    public static void main( String[] args)
    {
      Configuration cfg = new Configuration();
      cfg.configure();
      SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession();
      //AadharCard ac = new AadharCard(7001,"Govt of India",new Date(2019,10,11));
      Person p1 = session .get(Person.class,"ajay");
      if(p1!=null)
      {
    	  System.out.println(p1.getAddress()+"   "+p1.getAge());
    	  AadharCard ac = p1.getAcard();
    	  System.out.println(ac.getAid()+"   "+ac.getIssue_auth()+"   "+ac.getDate_of_issue());
      }
      AadharCard ac1 = session.get(AadharCard.class,7001);
      if(ac1!=null)
      {
    	  System.out.println(ac1.getIssue_auth()+"   "+ac1.getDate_of_issue());
    	  Person p = ac1.getPerson();
    	  System.out.println(p.getName()+"  "+p.getAddress()+"  "+p.getAge());
      }
      /*Transaction trans = session.beginTransaction();
      session.save(ac);  session.save(p1);
      trans.commit();  */ session.close();
      factory.close();
    }
}
