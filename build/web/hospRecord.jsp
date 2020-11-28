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
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
<h2 align="center"><font><strong>PATIENT  REPORT</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
               <td> Hospital ID </td>
               <td>Hospital Name</td>
               <td>Address</td>
               <td> District </td>
               <td> State </td>
               <td> Pincode </td>
               <td> Contact No. </td>
               <td> Email Id </td>
          
              
               
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
 
String sql ="SELECT * FROM hospreg  ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("hid") %></td>
<td><%=resultSet.getString("hname") %></td>

<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("district") %></td>
<td><%=resultSet.getString("state") %></td>
<td><%=resultSet.getString("pin") %></td>
<td><%=resultSet.getString("contact") %></td>
<td><%=resultSet.getString("email") %></td>
   


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>