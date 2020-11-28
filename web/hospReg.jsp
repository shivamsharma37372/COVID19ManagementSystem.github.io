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
     <form name="HospReg" action="hospRegAction.jsp" method="POST";>
         <TABLE align="center" border="1" style="border-collapse: collapse;" cellspacing="0" cellpadding="0" width="100%">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr>
         </table>
        
        <TABLE align="center" border="0" style="border-collapse: collapse;" cellspacing="1" cellpadding="0" width="30%">
            <TR height="30">
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> HOSPITAL REGISTRATION FORM</FONT></TD>
            </TR>
	
	<TR height="30" >
		<TD> HOSPITAL NAME </TD><TD><input type="text" name="hname" id="hname"></TD>
	</TR>

        <TR  height="30">
		<TD>ADDRESS </TD><TD><input type="text" name="address" id="address"></TD>
	</TR>
        
	<TR  height="30">
		<TD> DISTRICT </TD><TD><input type="text" name="district" id="district"></TD>
	</TR>

	<TR  height="30">
		<TD> STATE </TD><TD><input type="text" name="state" id="state"></TD>
	</TR>

	<TR  height="30">
		<TD> PINCODE</TD><TD><input type="text" name="pin" id="pin"></TD>
	</TR>
	
	<TR  height="30">
		<TD> CONTACT NO</TD><TD><input type="text" name="contact" id="contact"></TD>
	</TR>
	
	<TR  height="30">
		<TD> EMAIL-ID </TD><TD><input type="text" name="email" id="email"></TD>
	</TR>
	
	
	<TR  height="30">
 		<TD colspan="2" align="center"><input type="submit" value="SUBMIT"></TD>
	</TR>
        
        <tr  height="30">
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
