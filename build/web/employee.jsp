<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
	<TITLE>Employee Registration Form</TITLE>
</HEAD>

<BODY topmargin="0">
<%
	String eid=request.getParameter("eid");
	String joindate="", post="", ename="", dob="", gender="", father="", marital="", idname="", idnumber="", address1="", address2="", district1="", state1="", district2="", state2="", contact="", email="", age="", pin1="", pin2="", religion="";
	int sn=1;
	try 
	{
		if ( request.getParameter("eid") != null && ( !request.getParameter("eid").equals( "" ) ) ) 
		{
			Connection con=Connect.getConnection();
			String query = "select * from employee  where eid = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString( 1, eid );
			ResultSet rs = pstmt.executeQuery();
			if( rs.next() )
			{
				eid=rs.getString("eid"); 
				joindate=rs.getString("joindate"); 
				post=rs.getString("post");
				ename=rs.getString("ename"); 
				dob=rs.getString("dob"); 
				gender=rs.getString("gender"); 
				religion=rs.getString("religion"); 
				father=rs.getString("father"); 
				marital=rs.getString("marital"); 
				idname=rs.getString("idname");
				idnumber=rs.getString("idnumber"); 
				address1=rs.getString("address1");	
				district1=rs.getString("district1");
				state1=rs.getString("state1");
				address2=rs.getString("address2"); 
				district2=rs.getString("district2");
				state2=rs.getString("state2"); 
				contact=rs.getString("contact"); 
				email=rs.getString("email");
			} 
		}
	}
	catch ( Exception e )
	{
		out.println( "Error while execution e" + e );
	}
%>
	<TABLE align="center" width="100%" cellspacing="0" cellpadding="0">
		<TR>
			<TD align="center"><%@include file="header.jsp"%></TD>
		</TR>
	</TABLE>
	<TABLE align="center" border="1" width="100%" style="border-collapse: collapse;">
		<TR height="40">
			<TD align="center" colspan="7"><FONT SIZE="4" COLOR="#330033"><B>EMPLOYEE REGISTRATION FORM</B></FONT></TD>
		</TR>
<form name="employee" action="employeeAction.jsp" method="POST">
		<TR height="40">
			<TD>JOINING DATE&nbsp;<input type="date" name="joindate" value="<%=joindate%>" required></TD>
			<TD>POST </TD><TD><input type="text" name="post" id="post" value="<%=post%>"required></TD>
			<TD>NAME </TD><TD><input type="text" name="ename" value="<%=ename%>" required></TD>
			<TD>DOB </TD><TD align="right"><input type="date" name="dob" value="<%=dob%>" required></TD>
		</TR>
		<TR height="30">
			<TD>GENDER &nbsp;<select name="gender" required>
						<option selected><%=gender%></option>
						<option value="Male">MALE</option>
						<option value="Female">FEMALE</option>
						<option value="Other">OTHER</option>
					   </select>
			</TD>
			<TD>RELIGION</TD><TD><input type="text" name="religion" value="<%=religion%>" required></TD>			
			<TD>FATHER'S NAME</TD><TD><input type="text" name="father" value="<%=father%>" required></TD>
			<TD>MARITAL STATUS </TD><TD align="right">
				<select name="marital" value="<%=marital%>" required>
					<option selected><%=marital%></option>
					<option value="single">SINGLE</option>
					<option value="married">MARRIED</option>
					<option value="widowed">WIDOWED</option>
					<option value="separated">SEPARATED</option>
					<option value="divorced">DIVORCED</option>
			   </select>			
			</TD>			
		</TR>
		<TR height="30">
			<TD>CONTACT No.&nbsp;<input type="text" name="contact" value="<%=contact%>" required></TD>			
			<TD>EMAIL ID </TD><TD><input type="email" name="email" value="<%=email%>" required></TD>
			<TD>ID PROOF NAME </TD><TD>
			   <select name="idname" required>
					<option selected><%=idname%></option>
					<option value="ACN">AADHAR CARD</option>
					<option value="EIC">ELECTION I-CARD</option>
					<option value="DLN">DRIVING LICENCE</option>
					<option value="OTH">OTHER</option>
			   </select>
			</TD>
			<TD>ID NUMBER</TD><TD align="right"><input type="text" name="idnumber" value="<%=idnumber%>"></TD>			
		</TR>
		<TR height="30">
			<TD>PRESENT ADDRESS &nbsp;<input type="text" name="address1" value="<%=address1%>" required></TD>
			<TD>DISTRICT </TD><TD> <input type="text" name="district1" value="<%=district1%>" required></TD>
			<TD>STATE </TD><TD> <input type="text" name="state1" value="<%=state1%>" required></TD>
			<TD>PIN </TD><TD align="right"><input type="text" name="pin1" value="<%=pin1%>" required></TD>
		</TR>
		<TR height="30">
			<TD align="left">PERMANENT ADDRESS &nbsp;<input type="text" name="address2" value="<%=address2%>" required></TD>
			<TD>DISTRICT </TD><TD> <input type="text" name="district2" value="<%=district2%>" required></TD>
			<TD>STATE </TD><TD> <input type="text" name="state2" value="<%=state2%>" required></TD>
			<TD>PIN </TD><TD align="right"><input type="text" name="pin2" value="<%=pin2%>" required></TD>
		</TR>
		<TR height="40">
			<TD align="center" colspan="7"><input type="submit" value="REGISTER"></TD>
		</TR>
		<tr>
			<%
				if ( request.getParameter( "eid" ) != null && ( !request.getParameter( "eid" ).equals( "" ) ) ) {
			%>
				<input type="hidden" name="eid" id="eid"  value="<%=eid%>" />
			<%
				}						
			%>
	
		</tr>
	</TABLE>
</form>
<TABLE align="center" border="1" style="border-collapse: collapse;" cellspacing="0" cellpadding="0" width="100%">
	<TR height="40">
		<TD align="center" colspan="10"><FONT SIZE="4" COLOR="#000033">ALL EMPLOYEE LIST</FONT></TD>
	</TR>
	<TR height="30" bgcolor="#FFCCFF">
		<TD align="center">S.No.</TD>
		<TD align="center">REG. DATE</TD>
		<TD align="center">POST</TD>
		<TD align="center">EMPLOYEE</TD>	
		<TD align="center">ID PROOF</TD>		
		<TD align="center">PRESENT ADDRESS</TD>
		<TD align="center">PERMANENT ADDRESS</TD>
		<TD align="center">E-ADDRESS</TD>
		<TD align="center">EDIT</TD>
		<TD align="center">DELETE</TD>
	</TR>

<%
	try
	{
		Connection con=Connect.getConnection();
		String query="select eid, joindate, post, ename, DATE_FORMAT(FROM_DAYS(DATEDIFF(CURRENT_DATE, dob)),'%y Years') AS age, gender, religion, father, marital, idname, idnumber, address1, state1, district1, pin1, address2, district2, state2, pin2, contact, email from employee where isDeleted=0";
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			eid=rs.getString("eid");
			joindate=rs.getString("joindate");
			post=rs.getString("post");			
			ename=rs.getString("ename");
			age=rs.getString("age");
			gender=rs.getString("gender");
			religion=rs.getString("religion");
			father=rs.getString("father");
			marital=rs.getString("marital");
			idname=rs.getString("idname");
			idnumber=rs.getString("idnumber");			
			address1=rs.getString("address1");
			district1=rs.getString("district1");
			state1=rs.getString("state1");
			pin1=rs.getString("pin1");
			address2=rs.getString("address2");
			district2=rs.getString("district2");
			state2=rs.getString("state2");
			pin2=rs.getString("pin2");
			contact=rs.getString("contact");
			email=rs.getString("email");
%>
			<TR height="20">
				<TD align="center"><%=sn++%></TD>
				<TD><%=joindate%></TD>
				<TD><%=post%><br><center><%="<a href=\"employeecard.jsp?eid=" + eid+ "\">Print ID-Card</a>"%></center></TD>
				<TD><%=ename%> / <%=gender%> / <%=age%> / <%=marital%> <br> 
				<%
					if(gender.equals("Male"))
					{
				%>
				S/O &nbsp;<%=father%></TD>	
				<%
					}
					else
					{
				%>
						D/O &nbsp;<%=father%></TD>
				<%
					}
				%>
				<TD><%=idname%> / <%=idnumber%></TD>
				<TD><%=address1%><br> <%=district1%> / <%=state1%> / PIN-<%=pin1%></TD>
				<TD><%=address2%> <br> <%=district2%> / <%=state2%> / PIN-<%=pin2%></TD>
				<TD><B>MOB:-</B><%=contact%><br><%=email%></TD>

				<TD align="center"><%="<a href=\"employee.jsp?eid=" + eid+ "\">"%><img src="images/edit.jpg" width="30" height="30"><%="</a>"%></TD>
		        <TD align="center"><%="<a href=\"employee.jsp?eid1=" + eid + "\">"%><img src="images/delete.jpg" width="30" height="30"><%="</a>"%></TD>
			</TR>
	<%
		}
	}
	catch(Exception e)
	{
		out.print("hey : "+e);
	}
	%>
</TABLE>
<%
	String eid1=request.getParameter("eid1");	   		
	try
	{
		Connection con=Connect.getConnection();
		if ( eid1 != null && ( !eid1.equals( "" ) ) ) 
		{
			String q="update employee set isDeleted = ?, modified = ? where eid = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
        	
            if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "0" ) ) ) 
			{
				pstmt.setString(1, "0" );
			} 
			else 
			{
				pstmt.setString(1, "1");
			}
				
			Calendar c = Calendar.getInstance();
			String modified = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			pstmt.setString(2,modified);
			
			pstmt.setString(3,eid1);
		
			pstmt.executeUpdate();
			response.sendRedirect("employee.jsp");
			return;
		} 		
	}
	catch(SQLException e)
	{
		out.println("Hey...." +e);
	}
	
%>
</BODY>
</HTML>
