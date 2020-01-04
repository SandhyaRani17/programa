<%@page import="com.del.assesment.entity.Courses,com.del.assesment.dao.CoursesDAO" %>
<%
  	Courses c =(Courses)request.getAttribute("cor");
  	if(c==null) c=new Courses();
%>
<html>
<body>
	<form action="CoursesCrudServlet">
	<table align=center width=50% bgcolor=lightblue>
	<tr>
		<th>Course Id</th>
		<td><input type=text name=course_id value=<%=c.getCourse_id() %>></td>
		</tr>
		<tr>
		<th>Course Name</th>
		<td><input type=text name=course_name value=<%=c.getCourse_name() %>></td>
		</tr> 
		<tr>
		 <th>Course Duration</th>
		 <td><input type=text name=course_duration value=<%=c.getCourse_duration() %>></td>
		</tr>
		<tr>
		 <th>Course Fee</th>
		 <td><input type=text name=course_fee value=<%=c.getCourse_fee() %>></td>
		</tr>
		<tr>
		 <td><input type=submit value=Add_Courses name="sub"></td>
		 <td><input type=submit value=Show_Courses name="sub"></td>
		</tr>
		<tr>
		 <td><input type=submit value=Delete_Courses name="sub"></td>
		 <td><input type=submit value=Modify_Courses name="sub"></td>
		</tr>
	</table>
	</form>
</body>
</html>