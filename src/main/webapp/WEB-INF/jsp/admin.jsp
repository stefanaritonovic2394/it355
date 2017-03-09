<%-- 
    Document   : admin
    Created on : 09.03.2017., 14.25.53
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
    <body>
        <h1>Zdravo, admine!</h1>
        <h1>${message}</h1>
        
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
        <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
        <script>
            function formSubmit() {
                document.getElementById("logoutForm").submit();
            }
        </script>
 
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>
                Username je : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()"> Izloguj se</a>
            </h2>
        </c:if>
        
    </body>
</html>
