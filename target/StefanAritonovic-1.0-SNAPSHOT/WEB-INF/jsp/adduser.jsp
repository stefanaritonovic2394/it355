<%-- 
    Document   : adduser
    Created on : 14.03.2017., 19.03.40
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add user</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="user">
            <form:label path="korisnickoIme">Korisnicko ime</form:label>
            <form:input id="korisnickoIme" placeholder="korisnicko ime" path="korisnickoIme" /><br><br>
            <form:label path="email">Email</form:label>
            <form:input id="email" placeholder="email" path="email" /><br><br>
            <form:label path="lozinka">Lozinka</form:label>
            <form:input id="lozinka" placeholder="lozinka" path="lozinka" /><br><br>
            <button type="submit">Dodaj korisnika</button>
        </form:form>
    </body>
</html>
