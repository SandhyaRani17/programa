package com.del.assesment.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.assesment.dao.CoursesDAO;
import com.del.assesment.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet 
{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao =new CoursesDAO();
		Courses c =new Courses();
		String message="Successfully";
		c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
		RequestDispatcher rd=request.getRequestDispatcher("CoursesCrud.jsp");
		if(submit.equals("Add_Courses")||submit.equals("Modify_Courses"))
		{
			c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
			c.setCourse_name(request.getParameter("course_name"));
			c.setCourse_duration(Integer.parseInt(request.getParameter("course_duration")));
			c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
			if(submit.equals("Add_Courses"))
			{
				cdao.insertCourses(c);
				message=message+"InsertRecord";
			}
			else
			{
				cdao.modifyCourses(c);
				message=message+"modified record";
			}
		}
			else if(submit.equals("Delete_Courses"))
			{
				if(cdao.removeCourses(c.getCourse_id()))
				message=message+"record Deleted";
				else
					message="Deletion Failed";
			}
			else if(submit.equals("Show_Courses"))
			{
				c=cdao.getCourses(c.getCourse_id());
				if(c!=null)
				request.setAttribute("cor",c);
				else
					message="Courses doesnt exist";
			}
		out.println("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
		}
	}