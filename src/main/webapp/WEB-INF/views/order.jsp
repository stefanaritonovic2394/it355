<%-- 
    Document   : order
    Created on : 07.04.2017., 23.58.08
    Author     : stefa
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Narucivanje</title>
        <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="well lead">Narucite:</div>
            <form:form method="POST" modelAttribute="order" class="form-horizontal">
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="productName">Naziv proizvoda:</label>
                        <div class="col-md-7">
                            <form:input type="text" path="productName" id="productName" class="form-control input-sm" required="required"/>
                            <div class="has-error">
                                <form:errors path="productName" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="quantity">Kolicina:</label>
                        <div class="col-md-7">
                            <form:input type="text" path="quantity" id="quantity" class="form-control input-sm" required="required"/>
                            <div class="has-error">
                                <form:errors path="quantity" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit" value="Place Order" class="btn btn-primary btn-sm"/> ili <a href="<c:url value='/home' />">odustani</a>
                    </div>
                </div>
            </form:form>
        </div>
    </body>
</html>
