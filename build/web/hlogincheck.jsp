<%@ page import ="java.sql.*" %>
<%
    String loginid = request.getParameter("loginid");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid",
            "root","root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from hosplogin where loginid='" + loginid + "' and password='" + password + "'");
    if (rs.next()) {
        session.setAttribute("userid", loginid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("header1.jsp");
    } else {
        out.println("Invalid username or password <a href='hospLogin.jsp'>try again</a>");
    }
%>