'use strict';

angular.module('myApp')
        .controller('questionController',
                ['$scope', 'questionService', function ($scope, questionService) {
                        getQuestionList();

                        function getQuestionList() {
//bu webde deyismir niyese  run edin siz  refreshi goturmur 
                            console.log('i am here');
                            questionService.getQuestionList()
                                    .then(
                                            function (value) {

                                                $scope.questionList = value;

                                                console.log('value', value);
                                            },
                                            function (reason) {
                                                console.error(reason);
                                            }
                                    );

                        }

//portu nece deyise bilerik?
                        $scope.getQuestionById = getQuestionById;

                        function getQuestionById(id) {

                            console.log('dsdsdff');

                            questionService.getQuestionById(id)
                                    .then(
                                            function (value) {

                                                $scope.question = value;

                                                console.log('value', value);
                                            },
                                            function (reason) {
                                                console.error(reason);
                                            }
                                    );

                        }



                    }
                ]
                );
