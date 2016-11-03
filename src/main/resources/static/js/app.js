var app = angular.module('app', ['ngRoute', 'ngResource','ngAnimate', 'app.controller'])

    .config(function ($routeProvider, $locationProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/views/home.html',
                controller: 'homeController'
            })
            .when('/addHappyHour', {
                templateUrl: '/views/addHappyHourForm.html',
                controller: 'AddHappyHour'
            })
            .otherwise(
                {redirectTo: '/'}
            );
        $locationProvider.html5Mode(true);
    });
