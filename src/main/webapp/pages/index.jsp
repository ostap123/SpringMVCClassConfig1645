<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>hello! ${xxx}</h1>
<form action="/saveBlog" method="post">
    <input type="text" name="blogName">
    <input type="submit">

</form>
</body>
</html>
