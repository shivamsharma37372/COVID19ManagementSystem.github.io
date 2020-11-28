<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String loginid=request.getParameter("loginid");
	String password=request.getParameter("password");

			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into hosplogin(loginid,password,created,modified)values(?,?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,loginid);
                            pstmt.setString(2,password);
                            pstmt.setString(3,created);
                            pstmt.setString(4,modified);
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                           out.println("Sucessfully registered<a href='index.jsp'>   Homepage</a>");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
		