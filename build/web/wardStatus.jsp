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
     <form name="wardStatus" action="wardStatusAction.jsp" method="POST">
         
        <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
         
         
    <TABLE align="center" border="0">
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000">HOSPITAL WARD STATUS</FONT></TD>
	</TR>
	
	<TR height="30">
		<TD> WARD NAME </TD><TD><input type="text" name="wname" id="wname"></TD>
	</TR>
	
	<TR height="30">
            <td>  <label for="ward">Choose Ward:</label></td>
            <td>
                <select id="ward" name="ward">Ward 
             <option value="General ">General</option>
                    <option value="AC">AC</option>
                    <option value="Private">Private</option>
                    <option value="CGHS">CGHS</option>
                </select>
            </td>
        </TR>

	<TR height="30">
		<TD> STRENGTH </TD><TD><input type="text" name="strength" id="strength"></TD>
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
</body> 
</html>
