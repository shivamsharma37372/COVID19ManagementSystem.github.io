<!DOCTYPE html>
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
     <form name="wardStatus" action="passAction.jsp" method="POST">
         
        <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header.jsp"%></td>
	     </tr></table>
         
         
         
    <TABLE align="center" border="0">
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000">PASSWORD RESET </FONT></TD>
	</TR>
	
	<TR height="30">
		<TD> User id </TD><TD><input type="text" name="loginid" id="loginid"></TD>
	</TR>
	
	

	<TR height="30">
		<TD> New password </TD><TD><input type="text" name="password" id="password"></TD>
	</TR>

	<TR height="30">
	<TD  colspan="2" align="center"><input type="submit" value="Reset"></TD>
	</TR>
        
        <tr>
	  	<td height="40" align="center" colspan="2">
		<%
			if(message != null)
			{
				out.print(message);
			}
		%>
		</td>
	</tr>
          
</TABLE>
</body> 
</html>
