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
     <form name="patientReport" action="patientReport.jsp" method="GET">
 
        <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
         
    <TABLE align="center" border="0">
	<TR>
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> PATIENT STATUS REPORT FORM</FONT></TD>
	</TR>
	
       
	<TR height="30">
		<TD> PATIENT ID </TD><TD><input type="text" name="patient_id" id="patient_id"></TD>
	</TR>
        
        <TR height="30">
 		<TD> PATIENT NAME </TD><TD><input type="text" name="name" id="name"></TD>
	</TR>
	
        <TR height="30">
 		<TD> ADMISSION DATE </TD><TD><input type="text" name="admission_date" id="admission_date"></TD>
	</TR>
	
	<TR height="30">
            <td>  <label for="status">STATUS:</label></td>
            <td>
                <select id="status" name="status">Ward 
                    <option value="choose ">choose</option>
                    <option value="admitted ">Admitted</option>
                    <option value="discharged">Discharged</option>
                    <option value="self-quarantine">Self-Quarantine</option>
                    
                </select>
            </td>
        </TR>

	<TR height="30">
            <td>  <label for="ward">ADMITTED WARD</label></td>
            <td>
                <select id="admitted_ward" name="admitted_ward">Ward 
             <option value="General ">General</option>
                    <option value="AC">AC</option>
                    <option value="Private">Private</option>
                    <option value="CGHS">CGHS</option>
                </select>
            </td>
        </TR>
        <TR height="30">
		<TD> STATUS DATE</TD><TD><input type="text" name="status_date" id="status_date"></TD>
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
