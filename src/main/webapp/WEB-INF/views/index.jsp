<%-- 
    Document   : index
    Created on : 07.04.2017., 23.51.58
    Author     : stefa
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Order System</title>
        <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="well lead">Dobrodosli</div>
            <span class="well floatRight">
                <a href="<c:url value='/newOrder'/>">Narucite</a>
            </span>
        </div>
    </body>
</html>
