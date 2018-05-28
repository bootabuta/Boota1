<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="jquery" value="/resources/jquery" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>JBSprovider - ${title}</title>
    <script>
    window.menu = '${title}';
    window.contextRoot = '${contextRoot}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
     <!-- dataTable Bootstrap CSS -->
    <link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="${css}/app.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation Loading Here -->
    <%@include file="./shared/navbar.jsp" %>

    <!-- Page Content Loading Here -->
    <c:if test="${userClickHome == true }" >
    <%@include file="home.jsp" %>
    </c:if>
    
    <c:if test="${userClickAbout == true }" >
    <%@include file="about.jsp" %>
    </c:if>

	<c:if test="${userClickContact == true }" >
    <%@include file="contact.jsp" %>
    </c:if>
    
    <c:if test="${userClickShowProduct == true }" >
    <%@include file="singleProduct.jsp" %>
    </c:if>
    

    
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}" >
    <%@include file="listProducts.jsp" %>
    </c:if>
	
    <!-- Footer Loading Here -->
    <%@include file="./shared/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="${jquery}/jquery-3.2.1.min.js"></script>
     <script src="${js}/bootstrap.js"></script>
     <script src="${js}/bootstrap.bundle.min.js"></script>
    <script src="${js}/jquery.dataTables.js"></script>
    <script src="${js}/dataTables.bootstrap4.js"></script>
    <script src="${js}/app.js"></script>
    

  </body>

</html>