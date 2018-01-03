<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:query var="rs" dataSource="jdbc/springFirst">
select id, name, email, text from offers
</sql:query>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>You can Fight only the way you practice</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/offers">Show Current Offers</a>
<a href="<%=request.getContextPath()%>/createOffer">create Offers</a>
${name}
</body>
</html>