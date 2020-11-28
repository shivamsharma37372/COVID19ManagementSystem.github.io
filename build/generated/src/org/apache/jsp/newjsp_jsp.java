package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/link1.html");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "covid";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write(" <TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("             <tr>\n");
      out.write("\t\t<td align=\"center\">");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("\t<TITLE> New Document </TITLE>\n");
      out.write("\t<script type=\"text/javascript\" src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/litejquery.min.js' ></script>\n");
      out.write("</HEAD>\n");
      out.write("<body style=\"margin:0px; padding:0px; background-color:#FFFFFF\">\n");
      out.write("\t<TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("\t\t<TR height=\"30\" bgcolor=\"#006600\">\n");
      out.write("\t\t\t<TD align=\"left\" width=\"33%\"><FONT SIZE=\"5\" COLOR=\"#FFFFCC\">COVID-19 </FONT></TD>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<TD align=\"right\" width=\"33%\"><FONT SIZE=\"4\" COLOR=\"#FFFFFF\"><B>HOSPITAL PANEL</B></FONT></TD>\n");
      out.write("\t\t</TR>\n");
      out.write("\t</TABLE>\n");
      out.write("\t<TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("\t\t<TR bgcolor=\"#006600\">\n");
      out.write("\t\t\t<TD align=\"left\" width=\"100%\">");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(".dropbtn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 8px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 210px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"dropdown\">  \n");
      out.write("  <button class=\"dropbtn\">HOME</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"index.jsp\">HOME PAGE</a>    \n");
      out.write("  </div>  \n");
      out.write("</div>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">REGISTRATION</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"hospReg.jsp\">HOSPITAL REGISTRATION</a>\n");
      out.write("    <a href=\"patientReg.jsp\">PATIENT REGISTRATION</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">LOG-IN</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    \n");
      out.write("    <a href=\"hospLogin.jsp\">HOSPITAL LOGIN</a>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">REPORT</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"newjsp.jsp\">PATIENT REPORT </a>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">STATUS</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"patientStatus.jsp\">PATIENT STATUS </a>\n");
      out.write("    <a href=\"wardStatus.jsp\">WARD STATUS </a>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"dropdown\">  \n");
      out.write("  <button class=\"dropbtn\">LOGOUT</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"logout.jsp\">LOGOUT</a>    \n");
      out.write("  </div>  \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</TD>\n");
      out.write("\t\t</TR>\n");
      out.write("\t</TABLE>\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
      out.write("</td>\n");
      out.write("\t     </tr></table>\n");
      out.write("         \n");
      out.write("<h2 align=\"center\"><font><strong>PATIENT  REPORT</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#A52A2A\">\n");
      out.write("               <td>Patient id</td>\n");
      out.write("               <td>Patient name</td>\n");
      out.write("               <td>Admission date</td>\n");
      out.write("               <td>Admit ward</td>\n");
      out.write("               <td>Status</td>\n");
      out.write("               <td>Status date</td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
 String patientid = request.getParameter("patientid");  
String sql ="SELECT * FROM record ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("patientid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("pname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("admissiondate") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("admitward") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("status") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("statusdate") );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>");
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
