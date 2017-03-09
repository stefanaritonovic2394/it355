<%-- 
    Document   : welcome
    Created on : 09.03.2017., 18.36.14
    Author     : stefa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Dobrodosli</h1>
        <h1>${message}</h1>
        
        <sec:authorize access="hasRole('ROLE_USER')">
            
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
                    Vase korisnicko ime je : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()"> Izloguj se</a>
                </h2>
            </c:if>
            
        </sec:authorize>
    </body>
</html>
