<%@page language="java" import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException, java.sql.PreparedStatement, java.sql.ResultSet, connect.Connect, java.util.*, java.time.LocalDateTime, java.time.format.DateTimeFormatter"%>
<!doctype html>
<html lang="en">
 <head>  
  <title>Document</title>
 </head>
 <body topmargin="0">
 <%
	String name=request.getParameter("name");
        String patientid=request.getParameter("patientid");
        String admitdate=request.getParameter("admitdate");
        String status=request.getParameter("status");
        String admittedward =request.getParameter("admitted_ward");
        String status_date=request.getParameter("status_date");
         String pid=request.getParameter("pid");
	String isDeleted=request.getParameter("isDeleted");
  
        
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                     
          try{
                 Connection con=Connect.getConnection();           
		if ( pid != null && ( !pid.equals( "" ) ) )
                {
                           
                            String query="update patientstatus set(patientid,name,admitdate,status,admitted_ward,status_date,created,modified)values(?,?,?,?,?,?,?,?) where pid=?";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,patientid);
                            pstmt.setString(2,name);
                            pstmt.setString(3,admitdate);
                            pstmt.setString(4,status);
                            pstmt.setString(5,admittedward);
                            pstmt.setString(6,status_date);
                            pstmt.setString(7,created);
                            pstmt.setString(8,modified);
                          
                            
                               			
			if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "1" ) ) ) {
				pstmt.setString(9,"1" );
			} else {
				pstmt.setString(9,"0");
			}
		
					
			pstmt.executeUpdate();

			String date2="" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE );

			if(date2.equals(admission_date))
			{
				response.sendRedirect("patientStatus.jsp");
			}
			else
			{
				response.sendRedirect("patientReg.jsp");
			}
			return;
                           
                }
                        
            else             //BBC2017020000001
		{
			synchronized (this)
			{
				int n1=1001;
				String query2="select max(patient_id) as  patient_id from patientstatus";
				PreparedStatement pstmt1=con.prepareStatement(query2);		
				ResultSet rs = pstmt1.executeQuery();
				if( rs.next() )
				{					
					patient_id=rs.getString("patient_id");
				}
				System.out.println(patient_id);
				String s1=patient_id.substring(3,5);
				String s2=patient_id.substring(5,7);
				String s3=patient_id.substring(7,11);		
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
				/* ---------------------------------------*/
				
				if(s2.equals(ss1))
				{
					n2=n2+1;
					patient_id="BCC"+ss2+s2+n2;
					System.out.println(patient_id);
				}
				else
				{
					n2=n1;
					patient_id="BCC"+ss2+ss1+n2;
					System.out.println(patient_id);
				}
				String query="insert into patientstatus(patient_id,name,admission_date,status,admitted_ward,status_date,created,modified)values(?,?,?,?,?,?,?,?))";
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.executeUpdate();
				response.sendRedirect("patientStatus.jsp");
				return;			
			}
		}
          }
	    catch(Exception e)
                        {
                            out.print("hey..."+e);
                        }
  %>
 </BODY>
</HTML>
			
			