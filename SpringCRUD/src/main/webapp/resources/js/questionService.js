 
'use strict';

angular.module('myApp').factory('questionService', ['$http', '$q', function ($http, $q) {


    var restUri = 'http://localhost:8080/SpringCRUD/';

    var factory = {
        getQuestionList: getQuestionList,
        getQuestionById: getQuestionById

    };

    return factory;


    function getQuestionById(id) {

        var deferred = $q.defer();



        $http.get(restUri + 'getQuestionById/'+id)
            .then(
                function (value) {
                    deferred.resolve(value.data);

                },
                function (reason) {
                    console.error(reason);
                    deferred.reject(reason);
                }
            );

        return deferred.promise;
    }

    function  getQuestionList  () {

        var deferred = $q.defer();
 
        $http.get(restUri + 'getQuestionList')
            .then(
                function (value) {
                    deferred.resolve(value.data);

                },
                function (reason) {
                    console.error(reason.toLocaleString());
                    deferred.reject(reason);
                }
            );

        return deferred.promise;
    }

}]);