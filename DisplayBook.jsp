<%@page isELIgnored="false" %>
<html>
<body>
	<form action="bookCRUD">
	<table align="center" width=50%>
	<tr>
	<th>Book Id</th>
	<td><input type=text name=bookid value=${book.bookid }></td>
	</tr>
	<tr>
	<th>Book Name</th>
	<td><input type=text name=bookname value=${book.bookname }></td>
	</tr>
	<tr>
	<th>Book Price</th>
	<td><input type=text name=price value=${book.price }></td>
	</tr>
	<tr>
	<th>Book Author</th>
	<td><input type=text name=author value=${book.author }></td>
	</tr>
	<tr>
	<td><input type=submit value="Add_BookDetails" name="sub"></td>
	<td><input type=submit value="Del_BookDetails" name="sub"></td>
	<td><input type=submit value="Mod_BookDetails" name="sub"></td>
	<td><input type=submit value="Get_BookDetails" name="sub"></td>
	</table>
	</form>
</body>
</html>