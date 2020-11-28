    <%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String wname=request.getParameter("wname");
	String ward=request.getParameter("ward");
	String strength=request.getParameter("strength");
	
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into wardstatus(wname,ward,strength,created,modified)values(?,?,?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,wname);
                            pstmt.setString(2,ward);
                            pstmt.setString(3,strength);
                            pstmt.setString(4,created);
                            pstmt.setString(5,modified);
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("wardStatus.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			