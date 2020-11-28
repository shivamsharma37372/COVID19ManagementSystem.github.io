package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hospLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"Generator\" content=\"EditPlusÂ®\">\n");
      out.write("  <meta name=\"Author\" content=\"\">\n");
      out.write("  <meta name=\"Keywords\" content=\"\">\n");
      out.write("  <meta name=\"Description\" content=\"\">\n");
      out.write("  <title>Document</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">  \n");
      out.write("  <style>\n");
      out.write("  .login-box{\n");
      out.write("    height: 420px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write(" \n");
      out.write(" </style>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write(" <body topmargin=\"0\">\n");
      out.write("     \n");
      out.write(" \n");
      out.write("     ");
String message=(String)session.getAttribute("message");
      out.write("\n");
      out.write("     <form name=\"adminLogin\" action=\"hlogincheck.jsp\" method=\"POST\">\n");
      out.write("         <TABLE align=\"center\" width=\"120%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("            </table>\n");
      out.write("           <div class=\"login-box\">\n");
      out.write("    <img src=\"user.png\" class=\"avatar\">\n");
      out.write("        <h1>Hospital Login</h1>\n");
      out.write("            <p>Username</p>\n");
      out.write("            <input type=\"text\" name=\"loginid\" placeholder=\"Enter Username\" required=\"required\" id=\"loginid\">\n");
      out.write("            <p>Password</p>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required=\"required\" id=\"password\">\n");
      out.write("            <input type=\"submit\" name=\"submit\" value=\"login\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            <center><h1><a href=\"index.jsp\">Back</a></h1></center>\n");
      out.write("             <h1><a href=\"index.jsp\">Reset password</a></h1>\n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write("          \n");
      out.write("</TABLE>\n");
      out.write("</form>         \n");
      out.write("</body> \n");
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
