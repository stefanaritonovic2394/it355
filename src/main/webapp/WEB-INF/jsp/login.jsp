<%-- 
    Document   : login
    Created on : 09.03.2017., 14.29.34
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body onload="document.loginForm.username.focus();">
        
        <h1>Uloguj se:</h1>
        <c:if test="${not empty error}">
            <div class="error">${error}</div>
        </c:if>
        <c:if test="${not empty msg}">
            <div class="msg">${msg}</div>
        </c:if>
        
        <form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
            
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type='text' name='username'></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password' /></td>
                </tr>
                <tr>
                    <td colspan='2'>
                        <input name="submit" type="submit" value="Uloguj se" />
                    </td>
                </tr>
            </table>
            
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            
        </form>
    </body>
</html>
