import java.sql.Date;
import java.util.ArrayList;
public class StudentTest 
{
	public static void main(String[] args)
	{
		Student s = new Student(01,"sandhya",20,new Date(1999,9,17));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(s))
			System.out.println("Student record Inserted");
		else
			System.out.println("insertion failed");
	}
}