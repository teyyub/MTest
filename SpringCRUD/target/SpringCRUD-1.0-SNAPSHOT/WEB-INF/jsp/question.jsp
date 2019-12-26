<%-- 
    Document   : user
    Created on : Nov 11, 2019, 3:45:07 PM
    Author     : USER
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link  rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>User Page</title>
    </head>
    <body>

        <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Quick Example</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form role="form">
                            <div class="card-body">
                                <p><img  src="getImage/<c:out value='${question.id}'/>"></p>   
                                <div class="row">
                                    <label class="radio-inline"><input type="radio" name="optradio">A</label>
                                    <label class="radio-inline"><input type="radio" name="optradio">B</label>
                                    <label class="radio-inline"><input type="radio" name="optradio">C</label>
                                    <label class="radio-inline"><input type="radio" name="optradio">D</label>
                                </div> 
                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
                <!--/.col (left) -->
                <!-- right column -->
                <div class="col-md-6">

                    <div class="card card-info">
                        <div class="card-header">
                            <h3 class="card-title">Questions</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form class="form-horizontal">
                            <div class="card-body">
                                <c:forEach items="${questions}" var="q">
                                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                                        <div class="thumbnail">
                                            <div class="caption">
                                                <h3>${q.id}</h3>
                                                <p>${q.cor_answer}</p>                                                
                                                <p> Available quesiotn units in stock </p>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                            <!-- /.card-body -->
                            <div class="card-footer">
                                <button type="submit" class="btn btn-info">Sign in</button>
                                <button type="submit" class="btn btn-default float-right">Cancel</button>
                            </div>
                            <!-- /.card-footer -->
                        </form>
                    </div>
                    <!-- /.card -->

                </div>
            </div>
            <!-- /.card -->
        </div>
        <!--/.col (right) -->
    </div>
    <!-- /.row -->
</div><!-- /.container-fluid -->
</section>
</body>
</html>