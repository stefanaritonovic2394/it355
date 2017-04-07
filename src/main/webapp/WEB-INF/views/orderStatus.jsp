<%-- 
    Document   : orderStatus
    Created on : 08.04.2017., 00.10.33
    Author     : stefa
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Status porudzbine</title>
        <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="well lead">Status porudzbine</div>
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Naziv</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${orders}" var="entry">
                    <tr>
                        <td>${entry.key}</td>
                        <td>${entry.value.productName}</td>
                        <td>${entry.value.status}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <span class="well floatRight">
                <a href="<c:url value='/newOrder' />">Nastavi kupovinu!</a>
            </span>
        </div>
    </body>
</html>
