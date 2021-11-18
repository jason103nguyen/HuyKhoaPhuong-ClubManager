<%--
  Created by IntelliJ IDEA.
  User: phuong
  Date: 17/11/2021
  Time: 4:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Info Football Player</h1>
<p>
    Name: ${footballPlayerDto.name} <br/>
    Salary: ${footballPlayerDto.salary} <br/>
    Start of contract (dd-mm-yyyy): ${footballPlayerDto.startOfContract} <br/>
    End of contract (dd-mm-yyyy): ${footballPlayerDto.endOfContract} <br/>
    Number of shirt: ${footballPlayerDto.numberOfShirt} <br/>
</p>
</body>
</html>
