package com.deloitte.thirdmvn.firstspringapp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.deloitte.thirdmvn.firstspringapp.beans.Person;
import com.deloitte.thirdmvn.firstspringapp.beans.Wisher;
public class App1 
{
	public static void main(String[] args)
	{
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Person p = context.getBean(Person.class,"per1");
	System.out.println(p.getSsn()+"   "+ p.getName());
	System.out.println(p.getAddress().getHno()+"   "+p.getAddress().getCity());
	System.out.println(p.getAddress().getState());
	context.close();
	}
}
