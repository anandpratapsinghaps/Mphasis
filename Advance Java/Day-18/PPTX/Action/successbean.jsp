<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="com.example.jspaction.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Details</title>
    <style type="text/css">
        html, body {
            height: 100%;
        }
        td {
            border: 1px solid blue;
        }
        table {
            border: 2px solid red;
        }
    </style>
</head>
<body>
    <jsp:useBean id="userBean" class="com.example.jspaction.Employee" scope="request" />

    <%
    String designation = request.getParameter("designation");
    %>

    <% if (designation != null) {
        if (designation.equals("1")) {
    %>
        <jsp:include page="managersHeading.jsp">
            <jsp:param name="name" value="<%= userBean.getfName() %>" />
        </jsp:include>
    <% } else if (designation.equals("2")) { %>
        <jsp:include page="traineeHeading.jsp">
            <jsp:param name="name" value="<%= userBean.getfName() %>" />
        </jsp:include>
    <% } else if (designation.equals("3")) { %>
        <jsp:include page="developersHeadings.jsp">
            <jsp:param name="name" value="<%= userBean.getfName() %>" />
        </jsp:include>
    <% } 
    } %>

    <h1 style="color: green;"><%= request.getParameter("message") %></h1>
    <h1>Registration Details</h1>
    <table>
        <tr>
            <td>First Name</td>
            <td><jsp:getProperty name="userBean" property="fName" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><jsp:getProperty name="userBean" property="lName" /></td>
        </tr>
        <tr>
            <td>User Name</td>
            <td><jsp:getProperty name="userBean" property="uName" /></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><jsp:getProperty name="userBean" property="gender" /></td>
        </tr>
        <tr>
            <td>Hobbies</td>
            <td>
                <%
                String[] hobbies = userBean.getHobbies();
                if (hobbies != null) {
                    for (String hobby : hobbies) {
                        out.print(hobby + " ");
                    }
                }
                %>
            </td>
        </tr>
    </table>
</body>
</html>
