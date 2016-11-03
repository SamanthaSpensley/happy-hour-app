angular.module('app.controller', ["app.services"])

    .controller('homeController', function ($scope, BarInfoDS, $http) {
        $scope.view = {};
        $scope.view.barInfo = [];
        $scope.headingTitle = "Happy Hour";

        $scope.view.data = BarInfoDS.query();
        console.log($scope.view.data)

        $http.get('http://localhost:8080/barinfo')
            .then (function(data) {
                $scope.view.data = data.data;
                console.log($scope.view.data)
                addBars($scope.view.data);
            })


        var mapOptions = {
            zoom: 12,
            center: new google.maps.LatLng(39.7392, -104.9903),
            mapTypeId: google.maps.MapTypeId.TERRAIN
        }

        $scope.map = new google.maps.Map(document.getElementById('map'), mapOptions);

        $scope.markers = [];

        var infoWindow = new google.maps.InfoWindow();

        var createMarker = function (info) {

            var marker = new google.maps.Marker({
                map: $scope.map,
                position: new google.maps.LatLng(info.lat, info.long),
                title: info.restaurant
            });
            marker.content = '<div class="infoWindowContent">' + info.neighborhood + '</div>';

            google.maps.event.addListener(marker, 'click', function () {
                infoWindow.setContent('<h2>' + '<A HREF="#' + marker.title + '">' + marker.title + '</A>' + '</h2>' + marker.content);
                infoWindow.open($scope.map, marker);
            });

            $scope.markers.push(marker);

        }


        $scope.openInfoWindow = function (e, selectedMarker) {
            e.preventDefault();
            google.maps.event.trigger(selectedMarker, 'click');
        }

        var addBars = function(info) {
            var cities = [];
            for (var i = 0; i < info.length; i++) {
                cities.push({
                    restaurant: info[i].restaurantName,
                    neighborhood: info[i].neighborhood,
                    lat: info[i].latitude,
                    long: info[i].longitude
                })
            }
            for (var i = 0; i < cities.length; i++) {
                createMarker(cities[i]);
            }
        }

    })



    .controller('AddHappyHour', function ($scope, $location, BarInfoDS) {
        $scope.newHappyHour = {};
        $scope.checkbox = {};

        $scope.checkbox = {
            monday : false,
            tuesday : false,
            wednesday : false,
            thursday : false,
            friday : false,
            saturday : false,
            sunday : false
        };

        $scope.save = function save(){
            BarInfoDS.save($scope.newHappyHour);
            // BarInfoDS.save($scope.checkbox);
            $location.path("/");
        };

    });
>>>>>>> 2f5de2776472f077a1ad8b95d933d7c5f2c1266c
