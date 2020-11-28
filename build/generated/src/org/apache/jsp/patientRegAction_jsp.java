package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connect.Connect;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class patientRegAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" <head>  \n");
      out.write("  <title>Document</title>\n");
      out.write(" </head>\n");
      out.write(" <body topmargin=\"0\">\n");
      out.write(" ");

	
        String pid=request.getParameter("pid");
        String pname=request.getParameter("pname");
        String age=request.getParameter("age");
        String gender=request.getParameter("gender");
        String fname=request.getParameter("fname");
        String contact =request.getParameter("contact");
        String address=request.getParameter("address");
        String district=request.getParameter("district");
        String state=request.getParameter("state");
        String pin=request.getParameter("pin");
        String contactno=request.getParameter("contactno");
        String mailid=request.getParameter("mailid");
        String hname=request.getParameter("hname");
        String admitdate=request.getParameter("admitdate");
	String isDeleted=request.getParameter("isDeleted");
        String patientid="";
        
			Calendar c = Calendar.getInstance();
			String created = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			String modified=created;
                     
          try{
                 Connection con=Connect.getConnection();           
		if ( pid != null && ( !pid.equals( "" ) ) )
                {
                           
                            String query="update patient"
                                    + " set pname=?,age=?,gender=?,fname=?,contact=?,address=?,district=?,state=?,pin=?,contactno=?,mailid=?,hname=?,admitdate=?,created=?,modified=? isDeleted=? where pid=?";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            
                            pstmt.setString(1,patientid);
                            pstmt.setString(2,pname);
                            pstmt.setString(3,age);
                            pstmt.setString(4,gender);
                            pstmt.setString(5,fname);
                            pstmt.setString(6,contact);
                            pstmt.setString(7,address);
                            pstmt.setString(8,district);
                            pstmt.setString(9,state);
                            
                            pstmt.setString(10,pin);
                            pstmt.setString(11,contact);
                            pstmt.setString(12,mailid);
                            pstmt.setString(13,hname);
                            pstmt.setString(14,admitdate);
                    
                        if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "1" ) ) ) {
				pstmt.setString(14,"1" );
                            } 
                        else 
                            {
				pstmt.setString(14,"0");
                            }
                            pstmt.setString(15,created);
                            pstmt.setString(16,modified);
                           
                               			
			
                         pstmt.setString(1,pid);
					
			pstmt.executeUpdate();

			String date2="" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE );

			if(date2.equals(admitdate))
			{
				response.sendRedirect("patientReg.jsp");
			}
			else
			{
				response.sendRedirect("patientReport.jsp");
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
                             
                String query="insert into patient (patientid, pname, age, gender, fname, conatct, address, district, state, pin, contactno, mailid, hname, admitdate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(query);
                pstmt.setString(1,patientid);
                pstmt.setString(2,pname);
                pstmt.setString(3,age);
                pstmt.setString(4,gender);
                pstmt.setString(5,fname);
                pstmt.setString(6,contact);
                pstmt.setString(7,address);
                pstmt.setString(8,district);
                pstmt.setString(9,state);
                pstmt.setString(10,pin);
                pstmt.setString(11,contactno);
                pstmt.setString(12,mailid);
                pstmt.setString(13,hname);
                pstmt.setString(14,admitdate);
                
                pstmt.executeUpdate();
               
                response.sendRedirect("PatientRegAction.jsp");
                return;
                }
             }
          }
         catch(Exception e)
            {
            out.print("hey...."+e);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
