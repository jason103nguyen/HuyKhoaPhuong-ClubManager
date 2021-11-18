<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="width:50%; margin: auto;">
<div style="background-color: #EEEEEE; padding: 20px">
    <h1>Manager Club</h1>
    <p>The Football Player Information</p>
</div>

<p><hr/></p>

<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <td><label>Name</label></td>
            <td><c:out value="${fb.name}"/></td>
        </tr>

        <tr>
            <td><label>Salary</label></td>
            <td><c:out value="${fb.salary}"/></td>
        </tr>

        <tr>
            <td><label>Start of contract</label></td>
            <td><c:out value="${fb.startOfContract}"/></td>
        </tr>

        <tr>
            <td><label>End of contract</label></td>
            <td><c:out value="${fb.endOfContract}"/></td>
        </tr>

        <tr>
            <td><label>Number of shirt</label></td>
            <td><c:out value="${fb.numberOfShirt}"/></td>
        </tr>

    </table>
    <c:url var="listFbUrl" value="/list-fb"/>
    <a href="${listFbUrl}">Back to the list of football player</a>
</div>
</body>
</html>
