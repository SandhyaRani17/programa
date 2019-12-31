package com.deloitte.java.entity;
import java.io. FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class PersonStudent     
{
	public static void main(String[] args)
	{
		Student s=new Student(101,"sandhya",20,123,50,60,70);
		try(FileOutputStream fos=new FileOutputStream("stu.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);)
			{
				
				oos.writeObject(s);
			}
			catch(IOException  ex)
			{
				System.out.println(ex);
			}
	}
}
