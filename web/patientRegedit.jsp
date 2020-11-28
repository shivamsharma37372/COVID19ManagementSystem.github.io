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
			age=rs.getString("age");
                        gender=rs.getString("gender");
                        fname=rs.getString("fname");
                        cperson=rs.getString("cperson");
                        address=rs.getString("address");
                        district=rs.getString("district");
                        state=rs.getString("state");
                        pin=rs.getString("pin");
                        contactno=rs.getString("contactno");
                        mailid=rs.getString("mailid");
                        hname=rs.getString("hname");
                        
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
		<TD> AGE </TD><TD><input type="text" name="age" id="age" value="<%=age%>"></TD>
	</TR>

	<TR height="30">
            <td>GENDER</td> <td> <input type="text" id="male" name="gender" value="<%=gender%>">
               
            </td>   
        </TR>

	<TR height="30">
		<TD> FATHER'S NAME </TD><TD><input type="text" name="fname" value="<%=fname%>"></TD>
	</TR>

	<TR height="30">
		<TD> CONTACT PERSON</TD><TD><input type="text" name="cperson" id="cperson"value="<%=cperson%>"></TD>
	</TR>
	
	<TR height="30">
		<TD> ADDRESS </TD><TD><input type="text" name="address" id="address"value="<%=address%>"></TD>
	</TR>
	
	<TR height="30">
		<TD> DISTRICT </TD><TD><input type="text" name="district" id="district" value="<%=district%>"></TD>
	</TR>
	
	<TR height="30">
 		<TD> STATE </TD><TD><input type="text" name="state" id="state" value="<%=state%>"></TD>
	</TR>
	
	<TR height="30">
 		<TD> PINCODE </TD><TD><input type="text" name="pin" id="pin" value="<%=pin%>"></TD>
	</TR>

	<TR height="30">
 		<TD> CONATCT NO</TD><TD><input type="text" name="contactno" id="contactno" value="<%=contactno%>"></TD>
	</TR>

	<TR height="30">
 		<TD> EMAIL ID </TD><TD><input type="text" name="mailid" id="mailid" value="<%=mailid%>"></TD>
	</TR>

	<TR height="30">
 		<TD> HOSPITAL NAME </TD><TD><input type="text" name="hname" id="hname" value="<%=hname%>"></TD>
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
