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
     <form name="patientReport" action="patientStatusRAction.jsp" method="GET">
 
        <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
         
    <TABLE align="center" border="0">
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> PATIENT STATUS REPORT FORM</FONT></TD>
	</TR>
	
       
	<TR height="30">
		<TD> PATIENT ID </TD><TD><input type="text" name="patientid" id="patientid"></TD>
	</TR>
      
        <TR height="30">
                <TD  colspan="2" align="center"><input type="submit" value="SUBMIT"></TD>
	</TR>
        
	
	
        
        
</TABLE>
</body> 
</html>
