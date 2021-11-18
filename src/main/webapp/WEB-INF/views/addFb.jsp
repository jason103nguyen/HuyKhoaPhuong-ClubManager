<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Football Player</title>
</head>
<body style="width:50%; margin: auto;">
<div style="background-color: #EEEEEE; padding: 20px">
    <h1>Manager Club</h1>
    <p>Add Football Player</p>
</div>

<div>
    <p>Add new football player <hr/></p>

    <div>
        <form:form action="add-fb" method="POST" modelAttribute="footballPlayerDto">
            <table>
                <tr>
                    <td>Name</td>
                    <td><form:input type="text" path="name"/></td>
                </tr>

                <tr>
                    <td>Salary</td>
                    <td><form:input type="text" path="salary"/></td>
                </tr>

                <tr>
                    <td>Start of contract (dd-mm-yyyy)</td>
                    <td><form:input type="text" path="startOfContract"/></td>
                </tr>

                <tr>
                    <td>End of contract (dd-mm-yyyy)</td>
                    <td><form:input type="text" path="endOfContract"/></td>
                </tr>

                <tr>
                    <td>Number of shirt</td>
                    <td><form:input type="text" path="numberOfShirt"/></td>
                </tr>

                <tr>
                    <td><input type="submit" value="Add Football Player"></td>
                </tr>
            </table>

        </form:form>
    </div>
</div>

<div>
<p>Show Football Player</p>
    <c:forEach items="${listFb}" var="fb">
        <tr>
            <td>${fb.name}</td><br/>
        </tr>
    </c:forEach>
</div>

</body>
</html>