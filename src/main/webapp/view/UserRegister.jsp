<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- <!doctype html> -->
<!-- <html lang="en"> -->
<!-- <head> -->
<!--     <meta charset="UTF-8"> -->
<!--     <meta name="viewport" -->
<!--           content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"> -->
<!--     <meta http-equiv="X-UA-Compatible" content="ie=edge"> -->
<!--     <title>User Registration</title> -->
<!--     <style> -->
/*     .error{ */
/*         color:red; */
/*         font-size: 15px; */
/*         padding:10px; */
/*     } */
<!--     </style> -->
<!-- </head> -->
<!-- <body> -->

<%-- <form:form action="/users/UserRegister" method="POST" > --%>
<!--     <div class="form-group"> -->
<%--         <label>UserName:</label><form:input type= "text" path="uname" size="30" cssClass="form-control" placeholder="Enter name" /> --%>
<%--         <small><form:errors path="name" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<%--         <label>Password</label><form:input path="pwd" type="password" cssClass="form-control" placeholder="Enter Password!" /> --%>
<%--         <small><form:errors path="pwd" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<%--         <label>Confirm Password</label><form:input path="cpwd" type = "password" cssClass="form-control" placeholder="Enter Confirm Password!!" /> --%>
<%--         <small><form:errors path="cpwd" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<%--         <label>Email Address</label><form:input path="emailId" type="text" cssClass="form-control" placeholder="Enter EmailID" /> --%>
<%--         <small><form:errors path="emailId" cssClass="error" /></small> --%>
<!--     </div> -->
<!--      <div class="form-group"> -->
<%--         <label>City</label><form:input path="city" type="text" cssClass="form-control" placeholder="Enter City" /> --%>
<%--         <small><form:errors path="city" cssClass="error" /></small> --%>
<!--     </div> -->
<!--      <div class="form-group"> -->
<%--         <label>Street</label><form:input path="street" type="text" cssClass="form-control" placeholder="Enter Street" /> --%>
<%--         <small><form:errors path="street" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<%--         <label>State</label><form:input path="state" type="text" cssClass="form-control" placeholder="Enter State" /> --%>
<%--         <small><form:errors path="state" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<%--         <label>ZIP Code</label><form:input path="zip" type="text" cssClass="form-control" placeholder="Enter ZipCode" /> --%>
<%--         <small><form:errors path="zip" cssClass="error" /></small> --%>
<!--     </div> -->
<!--     <div class="form-group"> -->
<!--         <button type="submit" >Submit</button> -->
<!--     </div> -->
<%-- </form:form> --%>

<!-- </body> -->
<!-- </html> -->

<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>

<form action="/users/UserRegister" method="POST" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    <label for="uname"><b>UserName</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
    <label for="emailId"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="emailId" required>

    <label for="pwd"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pwd" required>

    <label for="cpwd"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="cpwd" required>
    
     <label for="city"><b>City</b></label>
    <input type="text" placeholder="Enter City" name="city" required>
    
     <label for="street"><b>Street</b></label>
    <input type="text" placeholder="Enter Street" name="street" required>
     <label for="state"><b>State</b></label>
    <input type="text" placeholder="Enter Username" name="state" required>
     <label for="zip"><b>ZipCode</b></label>
    <input type="number" placeholder="ZipCode" name="zip" required>
    
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>
