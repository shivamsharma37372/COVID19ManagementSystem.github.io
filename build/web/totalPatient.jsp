<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Count Rows JSP</title>
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
String strQuery = "SELECT COUNT(*) FROM patient";
ResultSet rs = st.executeQuery(strQuery);
String Countrow="";
while(rs.next()){
Countrow = rs.getString(1);
out.println("Total PATIENTS :" +Countrow);
}
}

catch (Exception e){
e.printStackTrace();
}
%>






</body>
</html>