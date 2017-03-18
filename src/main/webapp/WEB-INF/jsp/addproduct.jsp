<%-- 
    Document   : addproduct
    Created on : 14.03.2017., 19.11.43
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add product</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="product">
            <form:label path="naziv">Naziv</form:label>
            <form:input id="naziv" placeholder="naziv" path="naziv" /><br><br>
            <form:label path="opis">Opis</form:label>
            <form:input id="opis" placeholder="opis" path="opis" /><br><br>
            <form:label path="cena">Cena</form:label>
            <form:input id="cena" placeholder="cena" path="cena" /><br><br>
            <button type="submit">Dodaj proizvod</button>
        </form:form>
    </body>
</html>
