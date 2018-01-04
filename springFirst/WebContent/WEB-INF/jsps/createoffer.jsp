<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!-- for more Information about Spring form tag :-https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/view.html -->   

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>deep</title>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">


</head>
<body>

<sf:form action="${pageContext.request.contextPath}/docreate" method="post" commandName="offer">
	<table class="formtable">
		<tr>
			<td class="label">Name</td>
			<td class="control">
				<sf:input path="name" type="text" name = "name"/>
				<br/><sf:errors path="name" cssClass="error"></sf:errors> 
			</td>
		</tr>
		<tr>
			<td class="label">Email</td>
			<td class="control">
				<sf:input path="email" type="text" name = "email"/> 
				<br/><sf:errors path="email" cssClass="error"></sf:errors>
			</td>
		</tr>
		<tr>
			<td class="label">Text</td>
			<td class="control">
			<sf:textarea path="text" name="text"></sf:textarea>
			<br/><sf:errors path="text" cssClass="error"></sf:errors>
		</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input  type="submit" value= "submit"/> </td>
		</tr>
	</table>
	
</sf:form>


</body>
</html>