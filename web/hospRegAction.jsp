<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%     String hid=request.getParameter("hid");
	String hname=request.getParameter("hname");
        String address=request.getParameter("address");
        String district=request.getParameter("district");
        String state=request.getParameter("state");
        String pin=request.getParameter("pin");
        String contact=request.getParameter("contact");
	String email=request.getParameter("email");
        String adate=request.getParameter("adate");
			Calendar c = Calendar.getInstance();    
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into hospreg(hname,address,district,state,pin,contact,email)values(?,?,?,?,?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            
                           
                            
                            pstmt.setString(1,hname);
                            pstmt.setString(2,address);
                            pstmt.setString(3,district);
                            pstmt.setString(4,state);
                            pstmt.setString(5,pin);
                            pstmt.setString(6,contact);
                            pstmt.setString(7,email);
                          
                           
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("hospReg.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			