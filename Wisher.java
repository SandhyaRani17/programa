package com.deloitte.thirdmvn.firstspringapp.beans;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Wisher //implements DisposableBean,InitializingBean
{
	String message;
	public Wisher() {System.out.println("Bean is created");}
	/*public void afterPropertiesSet() 
	{
		System.out.println("from aps method");
	}
	public void destroy()
	{
		System.out.println("from dest methods");
	}*/
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	/*public void initWisher()
	{
		System.out.println("Bean is Initialized");
	}
	public void destWisher()
	{
		System.out.println("Bean is about to be destroyed");
	}*/
}
