<%-- 
    Document   : users
    Created on : 14.03.2017., 19.16.51
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <h1>Korisnici:</h1>
        <c:if test="${!empty users}">
        <table border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id</th>
                <th>Korisnicko ime</th>
                <th>Email</th>
                <th>Lozinka</th>
                <th>Izmeni</th>
                <th>Ukloni</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.korisnickoIme}</td>
                    <td>${user.email}</td>
                    <td>${user.lozinka}</td>
                    <td><a href="updateuser/${user.id}">Izmeni</a></td>
                    <td><a href="deleteuser/${user.id}">Ukloni</a></td>
                </tr>
            </c:forEach>
        </c:if>
        </table>
    </body>
</html>
