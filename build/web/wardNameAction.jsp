<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String wardname=request.getParameter("wardname");
	
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into wardname(wardname,created,modified)values(?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,wardname);
                            pstmt.setString(2,created);
                            pstmt.setString(3,modified);
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("wardName.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			