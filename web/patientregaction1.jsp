

<%@page language="java" import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException, java.sql.PreparedStatement, java.sql.ResultSet, connect.Connect, java.util.*, java.time.LocalDateTime, java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Action</title>
    </head>
    <body>
        <%
            String pid="",pname="",status="",admittedward="",fname="",cperson="",address="",district="",state="",pin="",contactno="",mailid="",hname="",admitdate="", patientid="";           
             pid=request.getParameter("pid");
             pname=request.getParameter("pname");
             admittedward=request.getParameter("admittedward");
           
             status=request.getParameter("status");
             admitdate=request.getParameter("admitdate");
             patientid="";
            Calendar c = Calendar.getInstance();
	    LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm a");  
            String created = currentDateTime.format(format);
            String modified=created;
        try
            {
                Connection con=Connect.getConnection();
       		if ( pid != null && ( !pid.equals( "" ) ) ) 
		{
                String query="update patient set pname=?,admitdate=?,status=?,admittedward=?";
			PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1,patientid);
				pstmt.setString(2,pname);
                                pstmt.setString(3,admitdate);
                                 pstmt.setString(4,status);  
                                  pstmt.setString(5,admittedward);  
              
			
			pstmt.setString(1,pid);
					
			pstmt.executeUpdate();

			
		}
                else//BBC2017020000001
		{
                    synchronized (this)
                    {
                            int n1=1001;
                            String query2="select max(patientid) as  patientid from patient";
                            PreparedStatement pstmt1 = con.prepareStatement(query2);		
                            ResultSet rs = pstmt1.executeQuery();
                            if( rs.next() )
                            {					
                                    patientid=rs.getString("patientid");
                            }
                             System.out.println(patientid);
                            String s1=patientid.substring(3,5);
                            String s2=patientid.substring(5,7);
                            String s3=patientid.substring(7,11);		
                            int n2=Integer.parseInt(s3);
                            /* ---------------------------------------*/
                            Calendar ca=Calendar.getInstance();
                            String year=""+ca.get(Calendar.YEAR);
                            int cal=(ca.get(Calendar.MONTH)+1);
                            String month="";
                            if(cal<10)
                            {
                                    month="0"+(ca.get(Calendar.MONTH)+1);
                            }
                            else
                            {
                                    month=""+(ca.get(Calendar.MONTH)+1);
                            }
                            String ss1=month;
                            String ss2=year.substring(2,4);
                            
                             if(s2.equals(ss1))
                            {
                                    n2=n2+1;
                                    patientid="CMS"+ss2+s2+n2;
                                    System.out.println(patientid);
                            }
                            else
                            {
                                    n2=n1;
                                    patientid="CMS"+ss2+ss1+n2;
                                    System.out.println(patientid);
                            }
                             
                String query="insert into patient (patientid, pname, admitdate,status,admittedward)values(?,?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(query);
                pstmt.setString(1,patientid);
                pstmt.setString(2,pname);
                pstmt.setString(3,admitdate);
                  pstmt.setString(4,status);
                    pstmt.setString(5,admittedward);
                pstmt.executeUpdate();
               
                response.sendRedirect("patientregaction1.jsp");
                return;
                }
             }
          }
         catch(Exception e)
            {
            out.print("hey...."+e);
            }
        %>
    </body>
</html>
