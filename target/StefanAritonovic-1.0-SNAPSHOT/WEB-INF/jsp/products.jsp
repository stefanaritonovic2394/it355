<%-- 
    Document   : products
    Created on : 14.03.2017., 19.24.27
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>Proizvodi:</h1>
        <c:if test="${!empty products}">
        <table border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id</th>
                <th>Naziv</th>
                <th>Opis</th>
                <th>Cena</th>
                <th>Izmeni</th>
                <th>Ukloni</th>
            </tr>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.naziv}</td>
                    <td>${product.opis}</td>
                    <td>${product.cena}</td>
                    <td><a href="updateproduct/${product.id}">Izmeni</a></td>
                    <td><a href="deleteproduct/${product.id}">Ukloni</a></td>
                </tr>
            </c:forEach>
        </c:if>
        </table>
    </body>
</html>
