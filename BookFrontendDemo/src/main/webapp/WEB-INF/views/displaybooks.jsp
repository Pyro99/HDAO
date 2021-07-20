<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="row">
	<c:forEach items="${books}" var="book">
	<a href="${pageContext.request.contextPath}/book/bookid/${book.prodId}">
	<img src="https://upload.wikimedia.org/wikipedia/en/a/a9/Harry_Potter_and_the_Deathly_Hallows.jpg" style="height:500"class="col-xl-1"/></a>
	<div class="col-lg-4 col-xl-2 col-sm-6 col-xs-12 col-m-6">
	<h2>${book.prodName}</h2>
	<p>Rs.${book.prodPrice}</p>
	</div>
	</c:forEach>
</div>
</body>
</html>
