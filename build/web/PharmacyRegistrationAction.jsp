
<%@page language="java" import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException, java.sql.PreparedStatement, java.sql.ResultSet, connect.Connect, java.util.*, java.time.LocalDateTime, java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
            String pid="",pname="",address="",district="",state="",pin="",contact="",emailid="", medicalid="";
             pid=request.getParameter("pid");
             pname=request.getParameter("pname");
             address=request.getParameter("address");
             district=request.getParameter("district");
             state=request.getParameter("state");
             pin=request.getParameter("pin");
             contact=request.getParameter("contact");
             emailid=request.getParameter("emailid");
             medicalid="";
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
                String query="update pharmacy set pname=?, address=?, district=?, state=?, pin=?, contact=?, emailid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1,medicalid);
				pstmt.setString(2,pname);
				pstmt.setString(3,address);
				pstmt.setString(4,district);
				pstmt.setString(5,state);
				pstmt.setString(6,pin);
                                pstmt.setString(7,contact);
				pstmt.setString(8,emailid);
                if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "1" ) ) ) {
				pstmt.setString(8,"1" );
			} else {
				pstmt.setString(8,"0");
			}

			pstmt.setString(9,modified);
			pstmt.setString(1,pid);

			pstmt.executeUpdate();

			String date2="" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE );


			return;
		}
                else//BBC2017020000001
		{
                    synchronized (this)
                    {
                            int n1=1001;
                            String query2="select max(medicalid) as  medicalid from pharmacy";
                            PreparedStatement pstmt1 = con.prepareStatement(query2);
                            ResultSet rs = pstmt1.executeQuery();
                            if( rs.next() )
                            {
                                    medicalid=rs.getString("medicalid");
                            }
                             System.out.println(medicalid);
                            String s1=medicalid.substring(3,5);
                            String s2=medicalid.substring(5,7);
                            String s3=medicalid.substring(7,11);
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
                                    medicalid="PMS"+ss2+s2+n2;
                                    System.out.println(medicalid);
                            }
                            else
                            {
                                    n2=n1;
                                    medicalid="PMS"+ss2+ss1+n2;
                                    System.out.println(medicalid);
                            }

                String query="insert into pharmacy (medicalid, pname, address, district, state, pin, contact, emailid)values(?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(query);
                pstmt.setString(1,medicalid);
                pstmt.setString(2,pname);
                pstmt.setString(3,address);
                pstmt.setString(4,district);
                pstmt.setString(5,state);
                pstmt.setString(6,pin);
                pstmt.setString(7,contact);
                pstmt.setString(8,emailid);

                pstmt.executeUpdate();

                response.sendRedirect("PharmacyRegistration.jsp");
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
