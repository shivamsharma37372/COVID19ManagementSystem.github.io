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

public final class patientregaction1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE> Patient Action </TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>");

	String pid=request.getParameter("pid");
        String pname=request.getParameter("pname");
	String age=request.getParameter("age");
	String gender=request.getParameter("gender");
        String fname=request.getParameter("fname");
	String cperson=request.getParameter("cperson");
        String address=request.getParameter("address");
	String district=request.getParameter("district");
	String state=request.getParameter("state");
	String pin=request.getParameter("pin");
	String contact=request.getParameter("contact");
	String email=request.getParameter("email");
	String hname=request.getParameter("hname");
	String adate=request.getParameter("adate");
	String patient_id="";
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
			String query="update patientreg set age=?, gender=?, cperson=?, hname=?, pname=?, adate=?, fname=?, address=?, district=?, state=?, pin=?, contact=?,email=?";
			PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,patient_id);
				pstmt.setString(2,pname);
                                pstmt.setString(3,age);
                                pstmt.setString(4,gender);
                                pstmt.setString(5,fname);
                                pstmt.setString(6,cperson);
				pstmt.setString(7,address);
				pstmt.setString(8,district);
				pstmt.setString(9,state);
				pstmt.setString(10,pin);
				pstmt.setString(11,contact);
				pstmt.setString(12,email);
                                pstmt.setString(13,hname);
                                pstmt.setString(14,adate);
				  			
			if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "1" ) ) ) {
				pstmt.setString(14,"1" );
			} else {
				pstmt.setString(14,"0");
			}
			
			pstmt.setString(15,modified);
			pstmt.setString(1,pid);
					
			pstmt.executeUpdate();

			String date2="" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE );

			if(date2.equals(age))
			{
				response.sendRedirect("patient.jsp");
			}
			else
			{
				response.sendRedirect("patient-list.jsp");
			}
			return;
		}
		else//BBC2017020000001
		{
                    synchronized (this)
                    {
                            int n1=1001;
                            String query2="select max(patient_id) as  patient_id from patientreg";
                            PreparedStatement pstmt1 = con.prepareStatement(query2);		
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
                                    patient_id="CMS"+ss2+s2+n2;
                                    System.out.println(patient_id);
                            }
                            else
                            {
                                    n2=n1;
                                    patient_id="CMS"+ss2+ss1+n2;
                                    System.out.println(patient_id);
                            }
                            String query="insert into patientreg(patient_id, pname, age, gender, fname, cperson, address, district, state, pin, contact, email, hname, adate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            PreparedStatement pstmt = con.prepareStatement(query);
                            pstmt.setString(1,patient_id);
                            pstmt.setString(2,pname);
                            pstmt.setString(3,age);
                            pstmt.setString(4,gender);
                            pstmt.setString(5,fname);
                            pstmt.setString(6,cperson);
                            pstmt.setString(7,address);
                            pstmt.setString(8,district);
                            pstmt.setString(9,state);
                            pstmt.setString(10,pin);
                            pstmt.setString(11,contact);
                            pstmt.setString(12,email);
                            pstmt.setString(13,hname);
                            pstmt.setString(14,adate);
                            pstmt.executeUpdate();
                            response.sendRedirect("patientReg.jsp");
                            return;			
                    }
            }
	}
	catch(Exception e)
	{
		out.println("Exception occured while execution"+e);
	}


      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>\n");
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
