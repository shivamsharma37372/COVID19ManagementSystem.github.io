package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wardName_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/link2.html");
  }

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write(" <head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"Generator\" content=\"EditPlusÂ®\">\r\n");
      out.write("  <meta name=\"Author\" content=\"\">\r\n");
      out.write("  <meta name=\"Keywords\" content=\"\">\r\n");
      out.write("  <meta name=\"Description\" content=\"\">\r\n");
      out.write("  <title>Document</title>\r\n");
      out.write(" </head>\r\n");
      out.write(" \r\n");
      out.write(" <body topmargin=\"0\">\r\n");
      out.write("     ");
String message=(String)session.getAttribute("message");
      out.write("\r\n");
      out.write("     <form name=\"wardName\" action=\"wardNameAction.jsp\" method=\"POST\">\r\n");
      out.write("         <TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("\t<TITLE> New Document </TITLE>\r\n");
      out.write("\t<script type=\"text/javascript\" src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/litejquery.min.js' ></script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<body style=\"margin:0px; padding:0px; background-color:#FFFFFF\">\r\n");
      out.write("\t<TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("\t\t<TR height=\"30\" bgcolor=\"#006600\">\r\n");
      out.write("\t\t\t<TD align=\"left\" width=\"33%\"><FONT SIZE=\"5\" COLOR=\"#FFFFCC\">COVID-19 MANAGEMENT SYSTEM</FONT></TD>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TD align=\"right\" width=\"33%\"><FONT SIZE=\"4\" COLOR=\"#FFFFFF\"><B>ADMIN PANNEL</B></FONT></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("\t\t<TR bgcolor=\"#006600\">\r\n");
      out.write("\t\t\t<TD align=\"left\" width=\"100%\">");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".dropbtn {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    min-width: 210px;\r\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropbtn {\r\n");
      out.write("    background-color: #3e8e41;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"dropdown\">  \r\n");
      out.write("  <button class=\"dropbtn\">HOME</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"medicine.jsp\">HOME PAGE</a>    \r\n");
      out.write("  </div>  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">REGISTRATION</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"saleform.jsp\">HOSPITAL REGISTRATION</a>\r\n");
      out.write("    <a href=\"saleform.jsp\">PATIENT REGISTRATION</a>\r\n");
      out.write("    <a href=\"saleform.jsp\">ADMIN</a>\t\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">LOG-IN</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"stockentry.jsp\"> ADMIN LOGIN</a>\r\n");
      out.write("    <a href=\"stockentry.jsp\">HOSPITAL LOGIN</a>    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">REPORT</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"supplier.jsp\">PATIENT REPORT </a>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">STATUS</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"supplier.jsp\">PATIENT STATUS </a>\r\n");
      out.write("    <a href=\"supplier.jsp\">WARD STATUS </a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"dropdown\">  \r\n");
      out.write("  <button class=\"dropbtn\">LOGOUT</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"index.jsp\">LOGOUT</a>    \r\n");
      out.write("  </div>  \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("</td>\r\n");
      out.write("\t     </tr></table>\r\n");
      out.write("         <TABLE align=\"center\" border=\"0\">\r\n");
      out.write("           \r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"center\" colspan=\"2\"><FONT SIZE=\"4\" COLOR=\"#FF0000\"> WARD NAME FORM</FONT></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t\r\n");
      out.write("\t<TR height=\"30\">\r\n");
      out.write("\t\t<TD> WARD NAME </TD><TD><input type=\"text\" name=\"wardname\" id=\"wardname\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t<TR height=\"30\"> \r\n");
      out.write("                <TD  colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"SUBMIT\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("\t  \t<td height=\"40\" align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t");

			if(message != null)
			{
				out.print(message);
			}
		
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("          \r\n");
      out.write("</TABLE>\r\n");
      out.write("</form>         \r\n");
      out.write("</body> \r\n");
      out.write("</html>\r\n");
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
