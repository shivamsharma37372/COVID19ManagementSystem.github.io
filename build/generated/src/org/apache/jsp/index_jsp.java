package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <!-- Basic -->\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("  \n");
      out.write("   <title>COVID 19</title>\n");
      out.write("   <meta name=\"keywords\" content=\"\">\n");
      out.write("   <meta name=\"description\" content=\"\">\n");
      out.write("   <meta name=\"author\" content=\"\">\n");
      out.write("   <!-- Site Icons -->\n");
      out.write("   <link rel=\"shortcut icon\" href=\"images/fevicon.ico.png\" type=\"image/x-icon\" />\n");
      out.write("   <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("   <!-- Bootstrap CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("   <!-- Site CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("   <!-- Colors CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/colors.css\">\n");
      out.write("   <!-- ALL VERSION CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/versions.css\">\n");
      out.write("   <!-- Responsive CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("   <!-- Custom CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("   <!-- Modernizer for Portfolio -->\n");
      out.write("   <script src=\"js/modernizer.js\"></script>\n");
      out.write("   <!-- [if lt IE 9] -->\n");
      out.write("   </head>\n");
      out.write("   <body class=\"clinic_version\">\n");
      out.write("      <!-- LOADER -->\n");
      out.write("      <div id=\"preloader\">\n");
      out.write("         <img class=\"preloader\" src=\"images/loaders/heart-loading2.gif\" alt=\"\">\n");
      out.write("      </div>\n");
      out.write("      <!-- END LOADER -->\n");
      out.write("      <header>\n");
      out.write("         \n");
      out.write("         <div class=\"header-bottom wow fadeIn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <nav class=\"main-menu\">\n");
      out.write("                  <div class=\"navbar-header\">\n");
      out.write("                     <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i></button>\n");
      out.write("                  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("                  <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                     <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a class=\"active\" href=\"index.html\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a data-scroll href=\"hospLogin.jsp\">HOSPITAL</a></li>\n");
      out.write("                        <li><a data-scroll href=\"adminLogin.jsp\">ADMIN</a></li>\n");
      out.write("                         <li><a data-scroll href=\"hospRegister.jsp\">Hospital registration</a></li>\n");
      out.write("                       <li><a data-scroll href=\"PharmacyRegistration.jsp\">Pharmacy registration</a></li>\n");
      out.write("                       <li><a data-scroll href=\"patientReport1.jsp\">Patient Report</a></li>\n");
      out.write("                       <li><a data-scroll href=\"visitor.jsp\">Visitor Statistics</a></li>\n");
      out.write("                     </ul>\n");
      out.write("                  </div>\n");
      out.write("               </nav>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </header>\n");
      out.write("      <div id=\"home\" class=\"parallax first-section wow fadeIn\" data-stellar-background-ratio=\"0.4\" style=\"background-image:url('images/slider-bg.png');\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                  <div class=\"text-contant\">\n");
      out.write("                     <h2>\n");
      out.write("                        <span class=\"center\"><span class=\"icon\"><img src=\"images/icon-logo.png\" alt=\"#\" /></span></span>\n");
      out.write("                        <a href=\"\" class=\"typewrite\" data-period=\"2000\" data-type='[ \"Welcome to COVID 19 CONTROL SYSTEM\" ]'>\n");
      out.write("                        <span class=\"wrap\"></span>\n");
      out.write("                        </a>\n");
      out.write("                     </h2>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end row -->\n");
      out.write("         </div>\n");
      out.write("         <!-- end container -->\n");
      out.write("      </div>\n");
      out.write("      <!-- end section -->\n");
      out.write("     \n");
      out.write("      <div id=\"about\" class=\"section wow fadeIn\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("               <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\n");
      out.write("               <h2>ABOUT COVID 19</h2>\n");
      out.write("            </div>\n");
      out.write("            <!-- end title -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"message-box\">\n");
      out.write("                     \n");
      out.write("                     <h2>COVID 19</h2>\n");
      out.write("                     <p class=\"lead\" >Coronavirus disease (COVID-19) is an infectious disease caused by a newly discovered coronavirus.\n");
      out.write("\n");
      out.write("Most people infected with the COVID-19 virus will experience mild to moderate respiratory illness and recover without requiring special treatment.  Older people, and those with underlying medical problems like cardiovascular disease, diabetes, chronic respiratory disease, and cancer are more likely to develop serious illness.\n");
      out.write("\n");
      out.write("The best way to prevent and slow down transmission is be well informed about the COVID-19 virus, the disease it causes and how it spreads. Protect yourself and others from infection by washing your hands or using an alcohol based rub frequently and not touching your face. \n");
      out.write("\n");
      out.write("The COVID-19 virus spreads primarily through droplets of saliva or discharge from the nose when an infected person coughs or sneezes, so it?s important that you also practice respiratory etiquette (for example, by coughing into a flexed elbow).\n");
      out.write("\n");
      out.write("At this time, there are no specific vaccines or treatments for COVID-19. However, there are many ongoing clinical trials evaluating potential treatments. WHO will continue to provide updated information as soon as clinical findings become available. </p>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                  <!-- end messagebox -->\n");
      out.write("               </div>\n");
      out.write("               <!-- end col -->\n");
      out.write("               \n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("      <!-- end copyrights -->\n");
      out.write("      <a href=\"#home\" data-scroll class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("      <!-- all js files -->\n");
      out.write("      <script src=\"js/all.js\"></script>\n");
      out.write("      <!-- all plugins -->\n");
      out.write("      <script src=\"js/custom.js\"></script>\n");
      out.write("      <!-- map -->\n");
      out.write("     <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap\"></script>\n");
      out.write("   </body>\n");
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
