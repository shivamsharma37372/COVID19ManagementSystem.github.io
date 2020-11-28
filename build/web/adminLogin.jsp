
<!DOCTYPE html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="style.css">  
  <style>
  .login-box{
    height: 380px;
    }
  </style>
 </head>
 
 <body topmargin="0">
     <%String message=(String)session.getAttribute("message");%>
     <form name="adminLogin" action="adminLoginAction.jsp" method="POST">
         <TABLE align="center" width="100%" cellspacing="0" cellpadding="0" border="0">
             
           <div class="login-box">
    <img src="user.png" class="avatar">
        <h1>Admin Login</h1>
            <p>Username</p>
            <input type="text" name="loginid" placeholder="Enter Username" required="required" id="loginid">
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password" required="required" id="password">
            <input type="submit" name="submit" value="Login">
            </form>
             <center><h1><a href="index.jsp">Back</a></h1></center>
        </div>   
        
       
          
</TABLE>
</form>         
</body> 
</html>
