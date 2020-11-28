 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header5.jsp"%></td>
	     </tr></table>
<%
Integer counter = (Integer)application.getAttribute("counter");
if (counter ==null || counter == 0)
{
out.println("Lets Fight this PANDEMIC SITUATION!");
counter = 1;
}
else
{
out.println("Lets Fight this PANDEMIC SITUATION!");
counter++;
}
application.setAttribute("counter", counter);
out.println("Total Number of visits :  "+counter);
%>
</body>
</html>