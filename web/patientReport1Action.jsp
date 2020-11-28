<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "covid";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
 <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header3.jsp"%></td>
	     </tr></table>
         
<h2 align="center"><font><strong>PATIENT  REPORT</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
               <td>Patient id</td>
               <td>Patient name</td>
               <td>Admission date</td>
               <td>Admit ward</td>
               <td>Status</td>
              
</tr>

<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
 String patientid = request.getParameter("patientid");  
String sql ="select * from patient where patientid = '"+request.getParameter("patientid")+"'";

resultSet = statement.executeQuery(sql);
 if(!resultSet.next()) 
 {
                out.println("Sorry, could not find patient with this PATIENT ID. ");
            } 
 else {
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("patientid") %></td>
<td><%=resultSet.getString("pname") %></td>
<td><%=resultSet.getString("admitdate") %></td>
<td><%=resultSet.getString("admittedward") %></td>
<td><%=resultSet.getString("status") %></td>


</tr>

<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>