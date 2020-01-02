import java.sql.Date;
import java.util.ArrayList;
import com.del.dao.EmployeeDAO;
import com.del.entity.Employee;
public class EmployeeTest
{
	public static void main(String[] args)
	{
		EmployeeDAO edao =new EmployeeDAO();
		if(edao.removeEmployee(103))
			System.out.println("Employee Deleted Sucessfully");
		else
			System.out.println("Employee with id 103 doesnot exist");
	}
}
