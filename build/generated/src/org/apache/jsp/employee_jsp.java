package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import connect.Connect;
import java.util.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("\t<TITLE>Employee Registration Form</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY topmargin=\"0\">\r\n");

	String eid=request.getParameter("eid");
	String joindate="", post="", ename="", dob="", gender="", father="", marital="", idname="", idnumber="", address1="", address2="", district1="", state1="", district2="", state2="", contact="", email="", age="", pin1="", pin2="", religion="";
	int sn=1;
	try 
	{
		if ( request.getParameter("eid") != null && ( !request.getParameter("eid").equals( "" ) ) ) 
		{
			Connection con=Connect.getConnection();
			String query = "select * from employee  where eid = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString( 1, eid );
			ResultSet rs = pstmt.executeQuery();
			if( rs.next() )
			{
				eid=rs.getString("eid"); 
				joindate=rs.getString("joindate"); 
				post=rs.getString("post");
				ename=rs.getString("ename"); 
				dob=rs.getString("dob"); 
				gender=rs.getString("gender"); 
				religion=rs.getString("religion"); 
				father=rs.getString("father"); 
				marital=rs.getString("marital"); 
				idname=rs.getString("idname");
				idnumber=rs.getString("idnumber"); 
				address1=rs.getString("address1");	
				district1=rs.getString("district1");
				state1=rs.getString("state1");
				address2=rs.getString("address2"); 
				district2=rs.getString("district2");
				state2=rs.getString("state2"); 
				contact=rs.getString("contact"); 
				email=rs.getString("email");
			} 
		}
	}
	catch ( Exception e )
	{
		out.println( "Error while execution e" + e );
	}

      out.write("\r\n");
      out.write("\t<TABLE align=\"center\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">");
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
      out.write("\t\t\t<TD align=\"left\" width=\"33%\"><FONT SIZE=\"5\" COLOR=\"#FFFFCC\">COVID-19 CONTROL SYSTEM</FONT></TD>\r\n");
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
      out.write("    <a href=\"index.jsp\">HOME PAGE</a>    \r\n");
      out.write("  </div>  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">REGISTRATION</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"hospReg.jsp\">HOSPITAL REGISTRATION</a>\r\n");
      out.write("    <a href=\"patientReg.jsp\">PATIENT REGISTRATION</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">LOG-IN</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"adminLogin.jsp\"> ADMIN LOGIN</a>\r\n");
      out.write("    <a href=\"hospLogin.jsp\">HOSPITAL LOGIN</a>    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">REPORT</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"patientReport.jsp\">PATIENT REPORT </a>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"dropdown\">\r\n");
      out.write("  <button class=\"dropbtn\">STATUS</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"patientStatus.jsp\">PATIENT STATUS </a>\r\n");
      out.write("    <a href=\"wardStatus.jsp\">WARD STATUS </a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"dropdown\">  \r\n");
      out.write("  <button class=\"dropbtn\">LOGOUT</button>\r\n");
      out.write("  <div class=\"dropdown-content\">\r\n");
      out.write("    <a href=\"logout.jsp\">LOGOUT</a>    \r\n");
      out.write("  </div>  \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE align=\"center\" border=\"1\" width=\"100%\" style=\"border-collapse: collapse;\">\r\n");
      out.write("\t\t<TR height=\"40\">\r\n");
      out.write("\t\t\t<TD align=\"center\" colspan=\"7\"><FONT SIZE=\"4\" COLOR=\"#330033\"><B>EMPLOYEE REGISTRATION FORM</B></FONT></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("<form name=\"employee\" action=\"employeeAction.jsp\" method=\"POST\">\r\n");
      out.write("\t\t<TR height=\"40\">\r\n");
      out.write("\t\t\t<TD>JOINING DATE&nbsp;<input type=\"date\" name=\"joindate\" value=\"");
      out.print(joindate);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>POST </TD><TD><input type=\"text\" name=\"post\" id=\"post\" value=\"");
      out.print(post);
      out.write("\"required></TD>\r\n");
      out.write("\t\t\t<TD>NAME </TD><TD><input type=\"text\" name=\"ename\" value=\"");
      out.print(ename);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>DOB </TD><TD align=\"right\"><input type=\"date\" name=\"dob\" value=\"");
      out.print(dob);
      out.write("\" required></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR height=\"30\">\r\n");
      out.write("\t\t\t<TD>GENDER &nbsp;<select name=\"gender\" required>\r\n");
      out.write("\t\t\t\t\t\t<option selected>");
      out.print(gender);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Male\">MALE</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Female\">FEMALE</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Other\">OTHER</option>\r\n");
      out.write("\t\t\t\t\t   </select>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD>RELIGION</TD><TD><input type=\"text\" name=\"religion\" value=\"");
      out.print(religion);
      out.write("\" required></TD>\t\t\t\r\n");
      out.write("\t\t\t<TD>FATHER'S NAME</TD><TD><input type=\"text\" name=\"father\" value=\"");
      out.print(father);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>MARITAL STATUS </TD><TD align=\"right\">\r\n");
      out.write("\t\t\t\t<select name=\"marital\" value=\"");
      out.print(marital);
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t<option selected>");
      out.print(marital);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"single\">SINGLE</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"married\">MARRIED</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"widowed\">WIDOWED</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"separated\">SEPARATED</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"divorced\">DIVORCED</option>\r\n");
      out.write("\t\t\t   </select>\t\t\t\r\n");
      out.write("\t\t\t</TD>\t\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR height=\"30\">\r\n");
      out.write("\t\t\t<TD>CONTACT No.&nbsp;<input type=\"text\" name=\"contact\" value=\"");
      out.print(contact);
      out.write("\" required></TD>\t\t\t\r\n");
      out.write("\t\t\t<TD>EMAIL ID </TD><TD><input type=\"email\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>ID PROOF NAME </TD><TD>\r\n");
      out.write("\t\t\t   <select name=\"idname\" required>\r\n");
      out.write("\t\t\t\t\t<option selected>");
      out.print(idname);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"ACN\">AADHAR CARD</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"EIC\">ELECTION I-CARD</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"DLN\">DRIVING LICENCE</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"OTH\">OTHER</option>\r\n");
      out.write("\t\t\t   </select>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD>ID NUMBER</TD><TD align=\"right\"><input type=\"text\" name=\"idnumber\" value=\"");
      out.print(idnumber);
      out.write("\"></TD>\t\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR height=\"30\">\r\n");
      out.write("\t\t\t<TD>PRESENT ADDRESS &nbsp;<input type=\"text\" name=\"address1\" value=\"");
      out.print(address1);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>DISTRICT </TD><TD> <input type=\"text\" name=\"district1\" value=\"");
      out.print(district1);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>STATE </TD><TD> <input type=\"text\" name=\"state1\" value=\"");
      out.print(state1);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>PIN </TD><TD align=\"right\"><input type=\"text\" name=\"pin1\" value=\"");
      out.print(pin1);
      out.write("\" required></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR height=\"30\">\r\n");
      out.write("\t\t\t<TD align=\"left\">PERMANENT ADDRESS &nbsp;<input type=\"text\" name=\"address2\" value=\"");
      out.print(address2);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>DISTRICT </TD><TD> <input type=\"text\" name=\"district2\" value=\"");
      out.print(district2);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>STATE </TD><TD> <input type=\"text\" name=\"state2\" value=\"");
      out.print(state2);
      out.write("\" required></TD>\r\n");
      out.write("\t\t\t<TD>PIN </TD><TD align=\"right\"><input type=\"text\" name=\"pin2\" value=\"");
      out.print(pin2);
      out.write("\" required></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR height=\"40\">\r\n");
      out.write("\t\t\t<TD align=\"center\" colspan=\"7\"><input type=\"submit\" value=\"REGISTER\"></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t");

				if ( request.getParameter( "eid" ) != null && ( !request.getParameter( "eid" ).equals( "" ) ) ) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"eid\" id=\"eid\"  value=\"");
      out.print(eid);
      out.write("\" />\r\n");
      out.write("\t\t\t");

				}						
			
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</form>\r\n");
      out.write("<TABLE align=\"center\" border=\"1\" style=\"border-collapse: collapse;\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("\t<TR height=\"40\">\r\n");
      out.write("\t\t<TD align=\"center\" colspan=\"10\"><FONT SIZE=\"4\" COLOR=\"#000033\">ALL EMPLOYEE LIST</FONT></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR height=\"30\" bgcolor=\"#FFCCFF\">\r\n");
      out.write("\t\t<TD align=\"center\">S.No.</TD>\r\n");
      out.write("\t\t<TD align=\"center\">REG. DATE</TD>\r\n");
      out.write("\t\t<TD align=\"center\">POST</TD>\r\n");
      out.write("\t\t<TD align=\"center\">EMPLOYEE</TD>\t\r\n");
      out.write("\t\t<TD align=\"center\">ID PROOF</TD>\t\t\r\n");
      out.write("\t\t<TD align=\"center\">PRESENT ADDRESS</TD>\r\n");
      out.write("\t\t<TD align=\"center\">PERMANENT ADDRESS</TD>\r\n");
      out.write("\t\t<TD align=\"center\">E-ADDRESS</TD>\r\n");
      out.write("\t\t<TD align=\"center\">EDIT</TD>\r\n");
      out.write("\t\t<TD align=\"center\">DELETE</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\r\n");

	try
	{
		Connection con=Connect.getConnection();
		String query="select eid, joindate, post, ename, DATE_FORMAT(FROM_DAYS(DATEDIFF(CURRENT_DATE, dob)),'%y Years') AS age, gender, religion, father, marital, idname, idnumber, address1, state1, district1, pin1, address2, district2, state2, pin2, contact, email from employee where isDeleted=0";
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			eid=rs.getString("eid");
			joindate=rs.getString("joindate");
			post=rs.getString("post");			
			ename=rs.getString("ename");
			age=rs.getString("age");
			gender=rs.getString("gender");
			religion=rs.getString("religion");
			father=rs.getString("father");
			marital=rs.getString("marital");
			idname=rs.getString("idname");
			idnumber=rs.getString("idnumber");			
			address1=rs.getString("address1");
			district1=rs.getString("district1");
			state1=rs.getString("state1");
			pin1=rs.getString("pin1");
			address2=rs.getString("address2");
			district2=rs.getString("district2");
			state2=rs.getString("state2");
			pin2=rs.getString("pin2");
			contact=rs.getString("contact");
			email=rs.getString("email");

      out.write("\r\n");
      out.write("\t\t\t<TR height=\"20\">\r\n");
      out.write("\t\t\t\t<TD align=\"center\">");
      out.print(sn++);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(joindate);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(post);
      out.write("<br><center>");
      out.print("<a href=\"employeecard.jsp?eid=" + eid+ "\">Print ID-Card</a>");
      out.write("</center></TD>\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(ename);
      out.write(" / ");
      out.print(gender);
      out.write(" / ");
      out.print(age);
      out.write(" / ");
      out.print(marital);
      out.write(" <br> \r\n");
      out.write("\t\t\t\t");

					if(gender.equals("Male"))
					{
				
      out.write("\r\n");
      out.write("\t\t\t\tS/O &nbsp;");
      out.print(father);
      out.write("</TD>\t\r\n");
      out.write("\t\t\t\t");

					}
					else
					{
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\tD/O &nbsp;");
      out.print(father);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(idname);
      out.write(" / ");
      out.print(idnumber);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(address1);
      out.write("<br> ");
      out.print(district1);
      out.write(" / ");
      out.print(state1);
      out.write(" / PIN-");
      out.print(pin1);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD>");
      out.print(address2);
      out.write(" <br> ");
      out.print(district2);
      out.write(" / ");
      out.print(state2);
      out.write(" / PIN-");
      out.print(pin2);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD><B>MOB:-</B>");
      out.print(contact);
      out.write("<br>");
      out.print(email);
      out.write("</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TD align=\"center\">");
      out.print("<a href=\"employee.jsp?eid=" + eid+ "\">");
      out.write("<img src=\"images/edit.jpg\" width=\"30\" height=\"30\">");
      out.print("</a>");
      out.write("</TD>\r\n");
      out.write("\t\t        <TD align=\"center\">");
      out.print("<a href=\"employee.jsp?eid1=" + eid + "\">");
      out.write("<img src=\"images/delete.jpg\" width=\"30\" height=\"30\">");
      out.print("</a>");
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t");

		}
	}
	catch(Exception e)
	{
		out.print("hey : "+e);
	}
	
      out.write("\r\n");
      out.write("</TABLE>\r\n");

	String eid1=request.getParameter("eid1");	   		
	try
	{
		Connection con=Connect.getConnection();
		if ( eid1 != null && ( !eid1.equals( "" ) ) ) 
		{
			String q="update employee set isDeleted = ?, modified = ? where eid = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
        	
            if ( request.getParameter("isDeleted") != null && ( request.getParameter("isDeleted").equals( "0" ) ) ) 
			{
				pstmt.setString(1, "0" );
			} 
			else 
			{
				pstmt.setString(1, "1");
			}
				
			Calendar c = Calendar.getInstance();
			String modified = "" + c.get( Calendar.YEAR ) + "-" + ( c.get( Calendar.MONTH ) + 1 ) + "-" + c.get( Calendar.DATE ) + " " + c.get( Calendar.HOUR ) + ":" + c.get( Calendar.MINUTE ) + ":" + c.get( Calendar.SECOND );
			pstmt.setString(2,modified);
			
			pstmt.setString(3,eid1);
		
			pstmt.executeUpdate();
			response.sendRedirect("employee.jsp");
			return;
		} 		
	}
	catch(SQLException e)
	{
		out.println("Hey...." +e);
	}
	

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
