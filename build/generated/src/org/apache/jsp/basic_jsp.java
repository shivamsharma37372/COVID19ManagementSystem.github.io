package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basic_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Database Lookup</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write(" \n");
      out.write("    <BODY>\n");
      out.write("        <H1>Database Lookup</H1>\n");
      out.write("        <FORM ACTION=\"record.jsp\" METHOD=\"POST\">\n");
      out.write("            Please enter the ID of the publisher you want to find:\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"TEXT\" name=\"patientid\" id=\"patientid\">\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\n");
      out.write("        </FORM>\n");
      out.write("    </BODY>\n");
      out.write("<HTML>");
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
