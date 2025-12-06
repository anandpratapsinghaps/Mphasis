<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib uri="/WEB-INF/datetags.tld" prefix="st" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>CustomTagDemo</title>
</head>

<body>
    <h2>Formatted Date:</h2>

    <!-- Using the custom tag with date format -->
    <st:Date format="MM-dd-yyyy" />

    <h2>Default Date (no format attribute):</h2>

    <st:Date />

</body>
</html>
