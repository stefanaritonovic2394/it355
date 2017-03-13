<%-- 
    Document   : prijava
    Created on : 12.03.2017., 17.10.56
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prijava</title>
    </head>
    <body>
        <h2>Please Login</h2>
        
        <form method="post" action="${flowExecutionUrl}">
        
            <input type="hidden" name="_eventId" value="performLogin"> 
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
        
            Enter Username<input type="text" name="userName" maxlength="40"><br>
            Enter Password <input type="password" name="password" maxlength="40">
            <input type="submit" value="Login" />
        
        </form>
        
    </body>
</html>
