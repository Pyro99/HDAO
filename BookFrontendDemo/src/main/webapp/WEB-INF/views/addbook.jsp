<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<sp:form action="${pageContext.request.contextPath}/book/add " modelAttribute="book" method="post">
<div class="form-group">
<label>Enter Product Name</label>
<sp:input path="prodName" placeholder ="Enter Product Name" class="form-control"/>
	</div>
<div class="form-group">
<label>Enter Product Price</label>
<sp:input path="prodPrice" placeholder="Enter Price" class="form-control"/>
</div>
	<div class="form-group">
<label>Enter Product Description</label>
<sp:input path="prodDesc"  placeholder="Enter Product Description" class="form-control"/>
</div>
<div class="form-group">
<input type="submit" value="Add Book" class="btn btn-primary btn-block">
<input type="reset" value="Reset" class="btn btn-danger btn-block">
</div>
</sp:form>
</div>
</body>
</html>



