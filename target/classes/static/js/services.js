angular.module('app.services',["ngResource"])
.factory('BarInfoDS', function ($resource) {
    var data = $resource('/barinfo/:id', {barinfo: '@id'}, {
        update: {
            method: 'PUT'
        }
    });
    return data;
});