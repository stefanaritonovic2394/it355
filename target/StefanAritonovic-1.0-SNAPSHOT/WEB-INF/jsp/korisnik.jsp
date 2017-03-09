<%-- 
    Document   : korisnik
    Created on : 04.03.2017., 17.03.29
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forma za unos korisnika</title>
    </head>
    <body>
        <h2>Unesite informacije o korisniku</h2>
        <form:form method="POST" action="/StefanAritonovic/addKorisnik">
            <table>
                <tr>
                    <td><form:label path="korisnickoIme"><spring:message code="username"/></form:label></td>
                    <td><form:input path="korisnickoIme" /></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="email"/></form:label></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td><form:label path="lozinka"><spring:message code="password"/></form:label></td>
                    <td><form:input path="lozinka" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Unesi"/>
                    </td>
                </tr>
            </table>
        </form:form>
        <%@ include file="footer.jsp" %>
    </body>
</html>
