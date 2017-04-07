<%-- 
    Document   : orderSuccess
    Created on : 08.04.2017., 00.06.54
    Author     : stefa
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Potvrda porudzbine</title>
        <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="alert alert-success lead">
                ${success}
            </div>
            
            <span class="well floatRight">
                <a href="<c:url value='/newOrder' />">Nastavi kupovinu</a>
            </span>
        
            <span class="well floatRight">
                <a href="<c:url value='/checkStatus' />">Proveri status porudzbine</a>
            </span>
        </div>
    </body>
</html>
