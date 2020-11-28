<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <% String message ="<h1>Enter correct login or password ,Please try again ...</h1>";
           session.setAttribute("message",message);
                            response.sendRedirect("hospLogin.jsp");
       %>
    </body>
</html>