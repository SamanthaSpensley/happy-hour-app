app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope, $http) {
    $scope.view = {};
    $scope.headingTitle = "Roles List";
    $http.get('http://localhost:8080/barinfo')
        .then(function(data){
            $scope.view.data = data.data;
        })
});