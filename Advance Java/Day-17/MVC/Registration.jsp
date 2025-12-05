<%@ page import="java.io.*,java.util.*" %>
<%@ page import="jakarta.servlet.*, jakarta.servlet.http.*" %>

<%
    String message = "";
    if (request.getAttribute("message") != null) {
        message = request.getAttribute("message").toString();
    }
%>

<html>
<head>
    <title>Registration Form</title>
    <style>
        body {
            text-align: center;
        }
        span {
            color: red;
        }
    </style>
    <script>
        function validate() {
            // Add your validation logic here
            return true; // Return true if validation passes, false otherwise
        }
    </script>
</head>
<body>

    <h1>Registration Form</h1>
    <span><%= message %></span>

    <form method="post" action="${pageContext.request.contextPath}/RegistrationController">
        <table>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="fName" id="tName" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lName" id="lName" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" id="password" /></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><textarea rows="4" cols="25" name="address"></textarea></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="text" name="age" /></td>
            </tr>
            <tr>
                <td>Country</td>
                <td>
                    <select name="country" id="country">
                        <option selected="selected" value="select">--Select--</option>
                        <option value="India">India</option>
                        <option value="Australia">Australia</option>
                        <option value="England">England</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>
                    <input type="radio" name="gender" value="Male" /> Male
                    <input type="radio" name="gender" value="Female" /> Female
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="Register" value="Register" onclick="return validate()" /></td>
                <td><input type="reset" name="reset" value="Reset"></td>
            </tr>
        </table>
    </form>

</body>
</html>
