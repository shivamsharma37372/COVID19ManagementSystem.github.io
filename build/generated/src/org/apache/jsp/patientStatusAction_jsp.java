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

public final class patientStatusAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String name=request.getParameter("name");
        String patient_id=request.getParameter("patient_id");
        String admission_date=request.getParameter("admission_date");
        String status=request.getParameter("status");
        String admitted_ward =request.getParameter("admitted_ward");
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
                           
                            String query="update patientstatus set(patient_id,name,admission_date,status,admitted_ward,status_date,created,modified)values(?,?,?,?,?,?,?,?) where pid=?";
                            PreparedStatement pstmt=con.prepareStatement(query);
                            pstmt.setString(1,patient_id);
                            pstmt.setString(2,name);
                            pstmt.setString(3,admission_date);
                            pstmt.setString(4,status);
                            pstmt.setString(5,admitted_ward);
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
  
      out.write("\n");
      out.write(" </BODY>\n");
      out.write("</HTML>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
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
