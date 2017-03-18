<%-- 
    Document   : updateuser
    Created on : 16.03.2017., 13.31.22
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update user</title>
    </head>
    <body>
        <h1>Izmeni korisnika</h1>
        <form:form method="POST" action="/StefanAritonovic/updateuser">
            <table>
                <tr>
                    <td></td>
                    <td><form:hidden path="id" /></td>
                </tr>
                <tr>
                    <td>Korisnicko ime :</td>
                    <td><form:input id="korisnickoIme" placeholder="korisnickoIme" path="korisnickoIme" /></td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td><form:input id="email" placeholder="email" path="email" /></td>
                </tr>
                <tr>
                    <td>Lozinka :</td>
                    <td><form:input id="lozinka" placeholder="lozinka" path="lozinka" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Azuriraj korisnika" /></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
