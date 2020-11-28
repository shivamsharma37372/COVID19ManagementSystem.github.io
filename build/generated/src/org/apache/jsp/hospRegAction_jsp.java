package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import connect.Connect;
import java.util.*;

public final class hospRegAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
     String hid=request.getParameter("hid");
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
                          
                            pstmt.setString(9,created);
                            pstmt.setString(10,modified);
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
