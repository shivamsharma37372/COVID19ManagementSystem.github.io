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
     <form name="patientReg" action="patientregaction2.jsp" method="POST">
 
        <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             <tr>
		<td align="center"><%@include file="header1.jsp"%></td>
	     </tr></table>
         
         
    <TABLE align="center" border="0">
	<TR  height="30">
		<TD align="center" colspan="2"><FONT SIZE="4" COLOR="#FF0000"> PATIENT REGISTRATION FORM</FONT></TD>
	</TR>
	
	<TR height="30">
		<TD> PATIENT NAME </TD><TD><input type="text" name="pname" id="pname"></TD>
	</TR>

	<TR height="30">
		<TD> AGE </TD><TD><input type="text" name="age" id="age"></TD>
	</TR>

	<TR height="30">
            <td>GENDER</td> <td> <input type="radio" id="male" name="gender" value="male">
                <label for="male">Male</label><br>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Female</label><br>
                <input type="radio" id="other" name="gender" value="other">
                <label for="other">Other</label>
            </td>   
                        </TR>

	<TR height="30">
		<TD> FATHER'S NAME </TD><TD><input type="text" name="fname" id="fname"></TD>
	</TR>

	<TR height="30">
		<TD> CONTACT PERSON</TD><TD><input type="text" name="cperson" id="cperson"></TD>
	</TR>
	
	<TR height="30">
		<TD> ADDRESS </TD><TD><input type="text" name="address" id="address"></TD>
	</TR>
	
	<TR height="30">
		<TD> DISTRICT </TD><TD><input type="text" name="district" id="district"></TD>
	</TR>
	
	<TR height="30">
 		<TD> STATE </TD><TD><input type="text" name="state" id="state"></TD>
	</TR>
	
	<TR height="30">
 		<TD> PINCODE </TD><TD><input type="text" name="pin" id="pin"></TD>
	</TR>

	<TR height="30">
 		<TD> CONATCT NO</TD><TD><input type="text" name="contactno" id="contactno"></TD>
	</TR>

	<TR height="30">
 		<TD> EMAIL ID </TD><TD><input type="text" name="mailid" id="mailid"></TD>
	</TR>

	<TR height="30">
 		<TD> HOSPITAL NAME </TD><TD><input type="text" name="hname" id="hname"></TD>
	</TR>

	<TR height="30">
 		<TD> ADMIT DATE </TD><TD><input type="date" name="admitdate" id="admitdate"></TD>
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
                <select id="admittedward" name="admittedward">Ward 
             <option value="General ">General</option>
                    <option value="AC">AC</option>
                    <option value="Private">Private</option>
                    <option value="CGHS">CGHS</option>
                </select>
            </td>
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
