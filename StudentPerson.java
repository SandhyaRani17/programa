package com.deloitte.java.entity;
import java.io. FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class StudentPerson      
{
	public static void main(String[] args)
	{
		Student s=null;
		try(FileInputStream fis=new FileInputStream("stu.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);)
			{
				s=(Student)ois.readObject();
				System.out.println(s.getSsn()+" "+s.getName()+" "+s.getAge()+" "+s.getRno()+" "+s.getM1()+" "+s.getM2()+" "+s.getM3());
			}
			catch(IOException | ClassNotFoundException ex)
			{
				System.out.println(ex);
			}
	}
}


