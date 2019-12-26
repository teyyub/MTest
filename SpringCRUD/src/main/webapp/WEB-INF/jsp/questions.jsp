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
<html ng-app="myApp">
    <head>

        <link rel="stylesheet" href="/SpringCRUD/resources/bootstrap/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <script src="/SpringCRUD/resources/js/jquery.min.js"></script>

        <title>User Page</title>
    </head>
    <body ng-app="myApp">

    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Question</h1>                
            </div>
        </div>
    </section>
    <section class="container" ng-controller="questionController">

        <div class="row">
            <c:forEach items="${questions}" var="q">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <a href=" <spring:url value= "#"/> " class="btn btn-primary">
                        ${q.id}
                    </a>
                </div>
            </c:forEach>
            

        </div>

        <div class="row">
            <c:forEach items="${questions}" var="q">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${q.id}</h3>
                            <p>${q.cor_answer}</p>
                            <p><img width="100" height="100" src="getImage/<c:out value='${q.id}'/>"></p> 
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="panel-body">
                    <table class="table table-hover" >
                        <thead>
                            <tr>
                                <th>name</th>
                                <th>surname</th>
                                <th width="10%"> Actions </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="elem in questionList" >
                                <td ng-bind="elem.id"></td>
                                <td ng-bind="elem.cor_answer"></td>
                                <td>  <a ng-click="getQuestionById(elem.id)" style="cursor: pointer;"> Details</a> </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>

    <script src="/SpringCRUD/resources/js/angular.min.js"></script>

    <script src="/SpringCRUD/resources/js/angular.js"></script>

    <script src="/SpringCRUD/resources/js/myApp.js"></script>

    <script src="/SpringCRUD/resources/js/questionController.js"></script>

    <script src="/SpringCRUD/resources/js/questionService.js"></script>
</body>
</html>