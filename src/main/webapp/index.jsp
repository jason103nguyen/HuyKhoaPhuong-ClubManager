<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%
    String redirectURL = "/HuyKhoaPhuong_ClubManager_war/list-fb";
    response.sendRedirect(redirectURL);
%>
</body>
</html>