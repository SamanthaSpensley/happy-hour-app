var app = angular.module('app', ['ngRoute','ngResource','ngAnimate']);
app.config(function($routeProvider, $locationProvider){
    $routeProvider
        .when('/',{
            templateUrl: '/views/home.html',
            controller: 'homeController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
    $locationProvider.html5Mode(true);
});