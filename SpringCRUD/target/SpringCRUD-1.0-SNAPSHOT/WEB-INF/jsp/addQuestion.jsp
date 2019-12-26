<%-- 
    Document   : user
    Created on : Nov 11, 2019, 3:45:07 PM
    Author     : USER
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link
            rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>User Page</title>
    </head>
    <body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Questions</h1>
                <p>Add Questions</p>
            </div>
        </div>
    </section>
    <section class="container">
        <form:form modelAttribute="newQuestion" class="form-horizontal" enctype="multipart/form-data">
            <fieldset>
                <legend>Add new Quastions</legend>
                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2" for="qi">Questions image</label>
                    <div class="col-lg-10">
                        <form:input id="qi" path="questionImage" type="file"
                                    class="form:input-large" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2" for="ca">Questions Answer</label>
                    <div class="col-lg-10">
                        <form:input id="ca" path="cor_answer"  class="form:input-large" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary"
                               value ="Add"/>
                        <a href="<spring:url value="/" />" class="btn btn-default">
                            <span class="glyphicon-hand-left glyphicon"></span> back
                        </a>
                    </div>
                </div>   
            </fieldset>
        </form:form>
    </section>
</body>
</html>