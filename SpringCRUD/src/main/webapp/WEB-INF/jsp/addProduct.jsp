<%-- 
    Document   : addProduct
    Created on : Nov 22, 2018, 8:19:13 PM
    Author     : USER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page  language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link  rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <p>Add products</p>
                    
                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
                <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                <fieldset>
                    <legend>Add new product</legend>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="productId"><spring:message code= "addProduct.form.productId.label"/></label>
                        <div class="col-lg-10">
                            <input  id="productId" path="productId" type="text"
                                    class="form-control"/>
                            <form:errors path="productId" cssClass="text-danger"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="name">asdasdasd</label>
                        <div class="col-lg-10">
                            <input id="name" path="name" type="text"
                                   class="form-control"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="unitPrice">Unite price</label>
                        <div class="col-lg-10">
                            <input id="unitPrice" path="unitPrice" type="text"
                                   class="form-control"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="manufacturer">Manufacturer</label>
                        <div class="col-lg-10">
                            <input id="manufacturer" path="manufacturer" type="text"
                                   class="form-control"/>
                        </div>
                    </div>   


                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="category">Category</label>
                        <div class="col-lg-10">
                            <input id="category" path="category" type="text"
                                   class="form-control"/>
                        </div>
                    </div>   

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="unitsInStock">Units In Stock</label>
                        <div class="col-lg-10">
                            <input id="unitsInStock" path="unitsInStock" type="text"
                                   class="form-control"/>
                        </div>
                    </div>   


                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2"
                               for="unitsInOrder">Units In Order</label>
                        <div class="col-lg-10">
                            <input id="unitsInOrder" path="unitsInOrder" type="text"
                                   class="form-control"/>
                        </div>
                    </div>   


                    <div class="form-group">
                        <label class="control-label col-lg-2" for="description">Description</label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows ="2" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2"
                               for="discontinued">Discontinued</label>
                        <div class="col-lg-10">
                            <form:checkbox id="discontinued" path="discontinued"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2" for="condition">Condition</label>

                        <div class="col-lg-10">
                            <form:radiobutton path="condition" value="New" />New
                            <form:radiobutton path="condition" value="Old" />Old
                            <form:radiobutton path="condition" value="Refurbished"/>Refurbished
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2" for="productImage">
                           asdadasdasd</label>
                        <div class="col-lg-10">
                            <input id="productImage" path="productImage" type="file" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary"
                                   value ="Add"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>