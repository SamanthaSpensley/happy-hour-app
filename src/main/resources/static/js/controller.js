app.controller('homeController', function($scope, $http) {
    $scope.view = {};
    $scope.headingTitle = "Roles List";
    $http.get('http://localhost:8080/barinfo')
        .then(function(data){
            $scope.view.data = data.data;
        })
});