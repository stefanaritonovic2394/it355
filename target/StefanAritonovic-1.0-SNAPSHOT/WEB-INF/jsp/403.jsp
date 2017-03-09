<%-- 
    Document   : 403
    Created on : 09.03.2017., 14.17.41
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>403</title>
    </head>
    <body>
        <h1>Nije ti dozvoljeno da vidis ovu stranu</h1>
        
        <c:choose>
            <c:when test="${empty username}">
                <h2>Uloguj se</h2>
            </c:when>
            <c:otherwise>
                <h2>Korisnice ${username} <br/>nije ti dozvoljeno da vidis ovu stranu!</h2>
            </c:otherwise>
        </c:choose>
        
    </body>
</html>
