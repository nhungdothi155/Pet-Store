<%@ page errorPage="error.jsp" %>  
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="<%=request.getServletContext().getContextPath() %>/customer/css/login.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Login</div>
    <div class="content">
      <form action="<%=request.getServletContext().getContextPath() %>/loginSuccess" method=POST>
        <div class="user-details">
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="username" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" name="password" required>
          </div>
        <div class="button">
          <input type="submit" value="Login">
        </div>
      </form>
    </div>
  </div>

</body>
</html>
