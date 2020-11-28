<!DOCTYPE html>
<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
 </head>
 
 <body topmargin="0">
 <%String message=(String)session.getAttribute("message");%>
     <form name="patientReport" action="patientReport.jsp" method="POST">
 
         <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
         
    <TABLE align="center" border="0">
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> PATIENT STATUS REPORT FORM</FONT></TD>
	</TR>
    </table>
     <TABLE  cellspacing="10" align="center" border="0" topmargin="30">   
	<TR>
		<TH> PATIENT ID </TH>
                <TH> PATIENT NAME </TH>
 		<TH> ADMISSION DATE </TH>
 		<TH> ADMIT IN WARD </TH>
		<TH> STATUS </TH>
                <TH> STATUS DATE</TH>
	</TR>
    <%
	String patientid="";
	String pname="";	
	String admitdate="";
	String admitted_ward="";
	String status="";
        String status_date="";
	int i=1;
	try
	{
		Connection con=Connect.getConnection();
				
		String query="select patientid,pname,admitdate,admitted_ward,status from patient";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			patientid=rs.getString("patientid");
			pname=rs.getString("pname");
			admitdate=rs.getString("admitdate");
			admitted_ward=rs.getString("admitted_ward");
			status=rs.getString("status");
                        status_date=rs.getString("status_date");
%>
			<TR>
				<TD><%=i%></TD>
				<TD><%=pname%></TD>
				<TD><%=admitdate%></TD>
				<TD><%=admitted_ward%></TD>
				<TD><%=status%></TD>
                                <TD><%=status_date%></TD>
				<TD>
					<%="<a href=\"patientReg.jsp?sid=" +patientid+ "\">EDIT</a>"%>
				</TD>
				<TD>
					<%="<a href=\"deleteStudent.jsp?sid=" + patientid + "\">DELETE</a>"%>
				</TD>
			</TR>
<%
		i=i+1;
		}
	}
	catch(Exception e)
	{
		out.print("hey...."+e);
	}

%>
</TABLE>
<br>
	<TABLE align="center">
		<TR>
			<TD align="center">
				<%if(message!=null)
				  {
					  out.print(message);
				  }
				%>
			</TD>
		</TR>
		
	</TABLE>
	
        

</body> 
</html>
