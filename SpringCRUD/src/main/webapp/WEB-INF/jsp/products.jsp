<%-- 
    Document   : products
    Created on : Dec 2, 2019, 3:36:36 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"  href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <p>All the available products in our store</p>
                    <p>
                        <a href=" <spring:url value= "product/add" /> " class="btn btn-primary">
                            <span class="glyphicon-info-sign glyphicon"/></span> Add
                        </a>
                    </p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">
                <c:forEach items="${products}" var="product">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <img src="<c:url value="/resources/image/${product.productId}.png">
                                 </c:url>" alt="image" style = "width:100%"/>
                            <div class="caption">
                                <h3>${product.name}</h3>
                                <p>${product.description}</p>
                                <p>$${product.unitPrice}</p>
                                <p>Available ${product.unitsInStock} units in stock</p>
                                <p>
                                    <a href=" <spring:url value= "/product?id=${product.productId}" /> " class="btn btn-primary">
                                        <span class="glyphicon-info-sign glyphicon"/></span> Details
                                    </a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>
