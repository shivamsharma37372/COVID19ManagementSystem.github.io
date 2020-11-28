    <%@page language="java" import="java.sql.*, connect.Connect, java.util.*"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String patientid=request.getParameter("patientid");
	String pname=request.getParameter("pname");
	String admissiondate=request.getParameter("admissiondate");
	String admitward=request.getParameter("admitward");
        String status=request.getParameter("status");
        String statusdate=request.getParameter("statusdate");
        
        
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                        
                        try{
                            Connection con=Connect.getConnection();
                            String query="insert into record(patientid,pname,admissiondate,admitward,status,statusdate)values(?,?,?,?,?,?)";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,patientid);
                            pstmt.setString(2,pname);
                            pstmt.setString(3,admissiondate);
                            pstmt.setString(4,admitward);
                            pstmt.setString(5,status);
                             pstmt.setString(6,statusdate);
                            pstmt.executeUpdate();
                            String message="Your Data has been Updated";
                            session.setAttribute("message",message);
                            response.sendRedirect("patientStatus.jsp");
                            return;
                            
                          }
                        catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
		