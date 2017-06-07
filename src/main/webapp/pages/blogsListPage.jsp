<%@include file="tmp/header.jsp"%>


<c:forEach items="${blogs}" var="blog">
        <h3>
            ${blog.blogName}
        </h3>
        <p>
            ${blog.description}
        </p>
        <a href="blog-${blog.id}">detalies</a>
        <hr>
        
    </c:forEach>
</body>
</html>
