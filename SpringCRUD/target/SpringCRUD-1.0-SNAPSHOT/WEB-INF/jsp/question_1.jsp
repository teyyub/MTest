<%-- 
    Document   : user
    Created on : Nov 11, 2019, 3:45:07 PM
    Author     : USER
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
        <form>
            <section>
                <div class="jumbotron">
                    <div class="container">
                        <h1>Questions</h1>
                        <p>Add Questions</p>
                    </div>
                </div>
            </section>
            <section class="container">
                <div class="row">
                    <div class="col">
                        <p><img width="100%" src="getImage/<c:out value='${question.id}'/>"></p>               
                    </div>
                    <div class="col">
                        <p>suallar</p>               
                    </div>
                </div>
                <div class="row">
                    <label class="radio-inline"><input type="radio" name="optradio">A</label>
                    <label class="radio-inline"><input type="radio" name="optradio">B</label>
                    <label class="radio-inline"><input type="radio" name="optradio">C</label>
                    <label class="radio-inline"><input type="radio" name="optradio">D</label>
                </div> 
                <div class="row">
                    <a href="<spring:url value="/exam_question?id=1"/>" class="btn btn-primary">
                        <span class="glyphicon-hand-left glyphicon"></span> previous
                    </a>
                    <a href="<spring:url value="/exam_question?id=1"/>" class="btn btn-primary">
                        <span class="glyphicon-hand-right glyphicon"></span> next
                    </a>
                </div>
            </section>
        </form>
    </body>
</html>