

<%@page language="java" import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException, java.sql.PreparedStatement, java.sql.ResultSet, connect.Connect, java.util.*, java.time.LocalDateTime, java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Action</title>
    </head>
    <body>
        <%
            String pid="",status="",admittedward="",pname="",age="",gender="",fname="",cperson="",address="",district="",state="",pin="",contactno="",mailid="",hname="",admitdate="", patientid="";           
             pid=request.getParameter("pid");
             pname=request.getParameter("pname");
             age=request.getParameter("age");
             gender=request.getParameter("gender");
             fname=request.getParameter("fname");
             cperson=request.getParameter("cperson");
             address=request.getParameter("address");
             district=request.getParameter("district");
             state=request.getParameter("state");
             pin=request.getParameter("pin");
             contactno=request.getParameter("contactno");
             mailid=request.getParameter("mailid");
             hname=request.getParameter("hname");
             admitdate=request.getParameter("admitdate");
             status=request.getParameter("status");
             admittedward=request.getParameter("admittedward");
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
                String query="update patient set pname=?, age=?, gender=?, fname=?, cperson=?, address=?, district=?, state=?, pin=?, contactno=?, mailid=?, hname=?, admitdate=?,status=?,admittedward=?";
			PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1,patientid);
				pstmt.setString(2,pname);
                                pstmt.setString(3,age);
                                pstmt.setString(4,gender);
                                pstmt.setString(5,fname);
                                pstmt.setString(6,cperson);
				pstmt.setString(7,address);
				pstmt.setString(8,district);
				pstmt.setString(9,state);
				pstmt.setString(10,pin);
				pstmt.setString(11,contactno);
				pstmt.setString(12,mailid);  
                                pstmt.setString(13,hname);
                                pstmt.setString(14,admitdate);
                                pstmt.setString(15,status);
                                pstmt.setString(16,admittedward);
                if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "1" ) ) ) {
				pstmt.setString(14,"1" );
			} else {
				pstmt.setString(14,"0");
			}
			
			
                        pstmt.setString(17,created);
                            pstmt.setString(18,modified);
                           
			pstmt.setString(1,pid);
					
			pstmt.executeUpdate();

			String date2="" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE );

                if(date2.equals(age))
			{
				response.sendRedirect("patientReg.jsp");
			}
			else
			{
				response.sendRedirect("patientRecord.jsp");
			}
			return;
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
                             
                String query="insert into patient (patientid, pname, age, gender, fname, cperson, address, district, state, pin, contactno, mailid, hname, admitdate,status,admittedward)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(query);
                pstmt.setString(1,patientid);
                pstmt.setString(2,pname);
                pstmt.setString(3,age);
                pstmt.setString(4,gender);
                pstmt.setString(5,fname);
                pstmt.setString(6,cperson);
                pstmt.setString(7,address);
                pstmt.setString(8,district);
                pstmt.setString(9,state);
                pstmt.setString(10,pin);
                pstmt.setString(11,contactno);
                pstmt.setString(12,mailid);
                pstmt.setString(13,hname);
                pstmt.setString(14,admitdate);
                 pstmt.setString(15,status);
                  pstmt.setString(16,admittedward);
                
                pstmt.executeUpdate();
               
                response.sendRedirect("patientReg.jsp");
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
