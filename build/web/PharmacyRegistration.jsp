<%-- 
    Document   : Labs
    Created on : 12 Aug, 2020, 11:33:02 AM
    Author     : SHIVAM SHARMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab Registration</title>
    </head>
    <body topmargin="1">
        <form name="Lab" action="PharmacyRegistrationAction.jsp">
            <table align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
            <tr>
		<td align="center"><%@include file="header2.jsp"%></td>
	     </tr>    
            </table>
             <table TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
         <tr>
             <td align="center" colspan="2"><font size="4" color="#FF0000">PHARMACY REGISTRATION FORM</font></td>
         </tr>
         <tr>
             <td>Name </td><td><input type="text" name="pname"id="pname"></td>
         </tr>
         <tr>
             <td>Address </td><td><input type="text" name="address"id="address"></td>
         </tr>
         <tr>
             <td>DISTRICT</td><td><input type="text" name="district" id="district"></td>
         </tr>
         <tr>
             <td>STATE</td><td><input type="text" name="state" id="state"></td>
         </tr>
         <tr>
             <td>PIN</td><td><input type="text" name="pin" id="pin"></td>
         </tr>
         <tr>
             <td>Contact </td><td><input type="text" name="contact"id="contact"></td>
         </tr>
          <tr>
             <td>EMAIL ID</td><td><input type="text" name="emailid" id="emailid"></td>
         </tr>
         <tr>
             <td  align="center" colspan="2"><input type="submit" value="submit"></td>
         </tr>
             </table>
    </form>
    </body>
</html>
