<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>
<body>

<form action="/admin/saveBlog" method="post">
    <input type="text" name="blogName">
    <textarea name="description">
    </textarea>
    <input type="submit">

</form>
<hr>
<sf:form method="post" action="/admin/savePost" modelAttribute="emptyPost">
    <sf:input path="postTitle"/>
    <sf:input path="postDescription"/>
    <sf:select path="blog">
        <c:forEach items="${blogs}" var="blog">
            <sf:option value="${blog.id}">
                ${blog.blogName}
            </sf:option>
        </c:forEach>
    </sf:select>
    <input type="submit" >

</sf:form>

</body>
</html>
