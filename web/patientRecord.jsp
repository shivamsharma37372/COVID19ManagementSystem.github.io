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
               <td>Patient id</td>
               <td>Patient name</td>
               <td> Age </td>
               <td> Gender </td>
               <td> Father name </td>
               <td> Contact Person </td>
               <td> Address </td>
               <td> District </td>
               <td> State </td>
               <td> Pincode </td>
               <td> Contact No. </td>
               <td> Email Id </td>
               <td> Hospital Name </td>
               <td>Admission date</td>
               <td>Status</td>
               <td>Admitted Ward</td>
               <td>Edit</td>
               <td>Delete</td>
               
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
 String patientid = request.getParameter("patientid");  
String sql ="SELECT * FROM patient  ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("patientid") %></td>
<td><%=resultSet.getString("pname") %></td>
<td><%=resultSet.getString("age") %></td>
<td><%=resultSet.getString("gender") %></td>
<td><%=resultSet.getString("fname") %></td>
<td><%=resultSet.getString("cperson") %></td>
<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("district") %></td>
<td><%=resultSet.getString("state") %></td>
<td><%=resultSet.getString("pin") %></td>
<td><%=resultSet.getString("contactno") %></td>
<td><%=resultSet.getString("mailid") %></td>
<td><%=resultSet.getString("hname") %></td>
<td><%=resultSet.getString("admitdate") %></td>
<td><%=resultSet.getString("status") %></td>
<td><%=resultSet.getString("admittedward") %></td>
    <Td>
                                            <%="<a href=\"patientRegedit.jsp?patientid=" + patientid+ "\">EDIT</a>"%>
                                    </Td>
                                    <Td>
                                            <%="<a href=\"deletePaient.jsp?patientid=" + patientid + "\">DELETE</a>"%>
                                    </Td>



</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>