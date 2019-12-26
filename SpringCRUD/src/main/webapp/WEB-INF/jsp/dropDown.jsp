<%-- 
    Document   : dropDown
    Created on : Dec 5, 2019, 1:43:37 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html data-ng-app="myApp">
    <head lang="en">
        <meta charset="utf-8">
        <title>AngularJS Drop Down Spring MVC JSON</title>
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
        <script type="text/javascript">

            var app = angular.module('myApp', []);
             app.controller('MyController', function ($scope, $http) {

                $scope.getPersonDataFromServer = function () {
                    console.log('in function');
                    $http({method: 'GET', url: 'populatePersonDataFromServer'}).
                            success(function (data, status, headers, config) {
                                $scope.personDatas = data;
                            }).
                            error(function (data, status, headers, config) {
                               console.log('something'); 
                                // called asynchronously if an error occurs
                                // or server returns response with an error status.
                            });
                };
            });

        </script>
    </head>

    <body data-ng-controller="MyController">
        <h3>Spring MVC AngularJS JSON Drop Down sample</h3>

        <table style="margin: 0px auto;" align="left">
            <tr>
                <td>
                    <div data-ng-init="getPersonDataFromServer()">
                        <b>Person Data:</b> 
                        <select id="personData">
                            <option value="">-- Select Persons --</option>
                            <option data-ng-repeat="personData in personDatas" value="{{personData.personId}}">{{personData.personName}}</option>
                        </select><br>
                    </div>
                </td>
            </tr>
        </table>

    </body>

</html>
