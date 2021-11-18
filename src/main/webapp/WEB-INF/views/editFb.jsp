<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Football Player</title>
</head>
<body style="width:50%; margin: auto;">
<div style="background-color: #EEEEEE; padding: 20px">
    <h1>Manager Club</h1>
    <p>Edit List Football</p>
</div>

<hr/>

<div align="center">
    <form:form method="POST" modelAttribute="fb" action="edit-fb">
        <table border="1" cellpadding="5">
            <tr>
                <td><label>ID</label></td>
                <td>${fb.id}</td>
                <td><form:input type="text" path="id"/></td>
            </tr>

            <tr>
                <td><label>Name</label></td>
                <td>${fb.name}</td>
                <td><form:input type="text" path="name" /></td>
            </tr>

            <tr>
                <td><label>Salary</label></td>
                <td>${fb.salary}</td>
                <td><form:input type="text" path="salary"/></td>
            </tr>

            <tr>
                <td><label>Start of contract (dd/mm/yyyy)</label></td>
                <td>${fb.startOfContract}</td>
                <td><form:input type="text" path="startOfContract"/></td>
            </tr>

            <tr>
                <td><label>End of contract (dd/mm/yyyy)</label></td>
                <td>${fb.endOfContract}</td>
                <td><form:input type="text" path="endOfContract"/></td>
            </tr>

            <tr>
                <td><label>Number of shirt</label></td>
                <td>${fb.numberOfShirt}</td>
                <td><form:input type="text" path="numberOfShirt"/></td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Edit Football Player"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>