<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.fa.training.utils.Mappings" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>The Football Player List</title>
</head>

<body style="width:50%; margin: auto;">
<div style="background-color: #EEEEEE; padding: 20px">
    <h1>Manager Club</h1>
    <p>The Football Player List</p>
</div>

    <p><hr/></p>

<div align="center">
    <c:url var="addUrl" value="/add-fb"/>
    <a href="${addUrl}">New Football Player</a>
    <table border="1" cellpadding="5">

        <tr>
            <th>Name</th>
            <th>Number of shirt</th>
            <th>View</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach var="fb" items="${listFb}">

            <c:url var="deleteUrl" value="/delete-fb">
                <c:param name="id" value="${fb.id}"/>
            </c:url>

            <c:url var="editUrl" value="/edit-fb">
                <c:param name="id" value="${fb.id}"/>
            </c:url>

            <c:url var="viewUrl" value="/view-fb">
                <c:param name="id" value="${fb.id}"/>
            </c:url>

            <tr>
                <td><c:out value="${fb.name}"/></td>
                <td><c:out value="${fb.numberOfShirt}"/></td>
                <td><a href="${viewUrl}">View</a></td>
                <td><a href="${editUrl}">Edit</a></td>
                <td><a href="${deleteUrl}">Delete</a></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>