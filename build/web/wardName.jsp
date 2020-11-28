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
     <form name="wardName" action="wardNameAction.jsp" method="POST">
         <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         <TABLE align="center" border="0">
           
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> WARD NAME FORM</FONT></TD>
	</TR>
	
	<TR height="30">
		<TD> WARD NAME </TD><TD><input type="text" name="wardname" id="wardname"></TD>
	</TR>

	<TR height="30"> 
                <TD  colspan="2" align="center"><input type="submit" value="SUBMIT"></TD>
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
</form>         
</body> 
</html>
