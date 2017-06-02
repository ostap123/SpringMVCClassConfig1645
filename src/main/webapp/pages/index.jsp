<%@include file="tmp/header.jsp"%>

<h1>hello! ${xxx}</h1>
<form action="/saveBlog" method="post">
    <input type="text" name="blogName">
    <textarea name="description">
    </textarea>
    <input type="submit">

</form>


<hr>
<p>
    <a href="/blogsList"> blogs List</a>
</p>
</body>
</html>
