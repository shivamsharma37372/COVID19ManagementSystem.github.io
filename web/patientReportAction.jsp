<%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String pname=request.getParameter("pname");
        String sno=request.getParameter("sno");
        String ward=request.getParameter("ward");
        String statusdate=request.getParameter("statusdate");
      
        String pid=request.getParameter("pid");
        String status=request.getParameter("status");
        String adate=request.getParameter("adate");
  
        
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into patientreport(pid,pname,adate,ward,status,statusdate,created,modified)values(?,?,?,?,?,?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                           
                            pstmt.setString(1,pid);
                            pstmt.setString(2,pname);
                            pstmt.setString(3,adate);
                            pstmt.setString(4,ward);
                            pstmt.setString(5,status);
                            pstmt.setString(6,statusdate);
                            pstmt.setString(7,created);
                            pstmt.setString(8,modified);
                                                      
                            
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("patientReport.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			