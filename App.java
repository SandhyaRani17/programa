package com.deloitte.thirdmvn.firstspringapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.deloitte.thirdmvn.firstspringapp.beans.Wisher;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Wisher w1 = (Wisher)context.getBean("wish1");
    	w1.setMessage("new Message");
    	Wisher w2 = (Wisher)context.getBean("wish1");
    	System.out.println(w1.getMessage()+"   "+w2.getMessage());
    	context.close();
    }
}
