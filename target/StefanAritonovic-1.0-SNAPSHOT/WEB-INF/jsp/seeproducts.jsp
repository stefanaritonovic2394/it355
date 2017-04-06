<%-- 
    Document   : seeproducts
    Created on : 06.04.2017., 20.35.27
    Author     : stefa
--%>

<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h1 class="text-center">Product list</h1>
<c:if test="${!empty products}">

    <div class="container">

        <table class="table table-striped"> 
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Category</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody> 
                <c:forEach items="${products}" var="product">

                    <tr>
                        <td>${product.name}</td>
                        <td>${product.description}</td>
                        <td>${product.price}</td>
                        <td>${product.category}</td>
                        <td><a href="<c:url value='/editProduct/${product.id}' />"><span class="glyphicon glyphicon-pencil"></span> Edit </a></td>
                        <td><a href="<c:url value='/deleteProduct/${product.id}' />"><span class="glyphicon glyphicon-remove"></span> Delete </a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>
</c:if>
<%@include file="footer.jsp" %>
