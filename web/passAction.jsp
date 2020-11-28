<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String loginid=request.getParameter("logind");
        String password=request.getParameter("password");
	
			
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="update hosplogin set password=? where loginid=?";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,loginid);
                            pstmt.setString(2,password);
                           
                            pstmt.executeUpdate();
                            String message="Your password has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("passwordreset.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			