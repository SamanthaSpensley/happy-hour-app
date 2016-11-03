angular.module('app.services',["ngResource"])
.factory('BarInfoDS', function ($resource) {
    var data = $resource('/barinfo/:id', {barinfo: '@id'}, {
        update: {
            method: 'PUT',
            isArray:false
        },
        save: {
            method: 'POST',
            isArray: false
        }
    });
    return data;
});