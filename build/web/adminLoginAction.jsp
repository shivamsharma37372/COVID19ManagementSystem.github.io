<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String loginid=request.getParameter("loginid");
        String password=request.getParameter("password");
       
        if((loginid.equals("sai") && password.equals("12345")))
            {
            session.setAttribute("login",loginid);
            response.sendRedirect("header.jsp");
            }
        else
                   out.println("Invalid password <a href='adminLogin.jsp'>try again</a>");

        %>
    </body>
</html>