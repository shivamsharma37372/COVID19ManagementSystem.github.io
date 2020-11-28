<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recovered Patients JSP</title>
</head>
<body>
     <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header6.jsp"%></td>
	     </tr></table>
    
<%
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/covid","root","root");
Statement st=con.createStatement();
String strQuery = "SELECT  COUNT(status) FROM record  group by status having status=discharged";
ResultSet rs = st.executeQuery(strQuery);

out.println("Recovered PATIENTS :" +rs);
}


catch (Exception e){
e.printStackTrace();
}
%>






</body>
</html>