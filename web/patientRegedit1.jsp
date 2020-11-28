<%@page language="java" import="java.sql.*, connect.Connect"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
 String patientid="", pname="", age="", gender="", fname="", mailid="",cperson="",address="",district="",state="",pin="",contactno="",hname="",admitdate="",status="",admittedward="";
 String message=(String)request.getAttribute("message");
 patientid=request.getParameter("patientid");
 
	try
	{
		Connection con=Connect.getConnection();
		String query="select * from patient where patientid="+"'"+patientid+"'";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			patientid=rs.getString("patientid");
			pname=rs.getString("pname");
			
                        
                        admitdate=rs.getString("admitdate");
                        status=rs.getString("status");
                        admittedward=rs.getString("admittedward");
                        
		}
	}
	catch(Exception e)
	{
		out.print("hey...."+e);
	}
 


 %>
 <form name="patientReg" action="patientregaction2.jsp" method="POST">
  <table align="center" width="100%">
	  <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	  </tr>
	</table>
	<TABLE align="center" border="0">
	<TR  height="30">
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> PATIENT REGISTRATION FORM</FONT></TD>
	</TR>
	
	<TR height="30">
		<TD> PATIENT NAME </TD><TD><input type="text" name="pname"value="<%=pname%>"></TD>
	</TR>

	

	<TR height="30">
 		<TD> ADMIT DATE </TD><TD><input type="text" name="admitdate" id="admitdate" value="<%=admitdate%>"></TD>
	</TR>
        
       <TR height="30">
 		<TD> STATUS </TD><TD><input type="text" name="status" id="status" value="<%=status%>"></TD>
	</TR> 
        
      <TR height="30">
 		<TD> ADMITTED WARD </TD><TD><input type="text" name="admittedward" id="admittedward" value="<%=admittedward%>"></TD>
	</TR>  
        
       
        </TR>
        
	<TR height="30">
                <TD  colspan="2" align="center"><input type="submit" value="SUBMIT"></TD>
	</TR>
         <tr>
			<%
				if ( request.getParameter( "patientid" ) != null && ( !request.getParameter( "patientid" ).equals( "" ) ) ) {
			%>
				<input type="hidden" name="patientid" id="patientid"  value="<%=patientid%>" />
			<%
				}						
			%>
	
		</tr>
	  <tr>
	  	<td align="center">
		<%
			if(message != null)
			{
				out.print(message);
			}
		%>
		</td>
	  </tr>
  </table>
 </form>
 </body>
</html>
