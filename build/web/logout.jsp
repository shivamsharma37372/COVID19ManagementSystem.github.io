<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

        session.removeAttribute("loginid");
        session.removeAttribute("password");
        session.invalidate();
        out.println("Visit homepage <a href='index.jsp'>Homepage</a>");
        %>
        <h1>Logout was done successfully.</h1>
       
    </body>
</html>