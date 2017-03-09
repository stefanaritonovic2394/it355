<%-- 
    Document   : prikaz
    Created on : 04.03.2017., 17.02.55
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz podataka o korisniku</title>
    </head>
    <body>
        <h2>Podaci o korisniku</h2>
        <table>
            <tr>
                <td>Korisnicko ime</td>
                <td>${korisnickoIme}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${email}</td>
            </tr>
            <tr>
                <td>Lozinka</td>
                <td>${lozinka}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>
