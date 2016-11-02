angular.module('app.controller', ["app.services"])

.controller('homeController', function ($scope, BarInfoDS) {
    $scope.view = {};
    $scope.headingTitle = "Happy Hour";

    $scope.view.data = BarInfoDS.query();

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

    // without the var it was a global variable
    for (var i = 0; i < cities.length; i++) {
        createMarker(cities[i]);
    }

    $scope.openInfoWindow = function (e, selectedMarker) {
        e.preventDefault();
        google.maps.event.trigger(selectedMarker, 'click');
    }

})

.controller('AddHappyHour', function ($scope, $location, BarInfoDS) {
    $scope.newHappyHour = {};
    $scope.checkbox = {};


    $scope.checkbox = {
        monday : true,
        tuesday : false
    };

    $scope.save = function save(){
        BarInfoDS.save($scope.newHappyHour);
        // BarInfoDS.save($scope.checkbox);
        $location.path("/");
    };

});


//Data
var cities = [
    {
        restaurant: 'Linger',
        neighborhood: 'Lohi',
        lat: 39.759526,
        long: -105.0136293
    },
    {
        restaurant: 'Lola',
        neighborhood: 'Lohi',
        lat: 39.7592294,
        long: -105.0107865
    },
    {
        restaurant: 'Dunbar Kitchen & Tap House',
        neighborhood: 'Rino/Five Points',
        lat: 39.756242,
        long: -104.975893
    },
    {
        restaurant: 'Central Bistro and Bar',
        neighborhood: 'Lohi',
        lat: 39.759193,
        long: -105.0084136
    },
    {
        restaurant: 'Old Major',
        neighborhood: 'Lohi',
        lat: 39.763547,
        long: -105.010789
    },
    {
        restaurant: 'Humbolt Farm-Fish-Wine',
        neighborhood: 'Uptown',
        lat: 39.743485,
        long: -104.969341
    },
    {
        restaurant: 'The Way Back',
        neighborhood: 'Highlands',
        lat: 39.769235,
        long: -105.041319
    },
    {
        restaurant: 'Larimer Lounge',
        neighborhood: 'Curtis Park',
        lat: 39.7599262,
        long: -104.9838041
    },
    {
        restaurant: 'Ace',
        neighborhood: 'Uptown',
        lat: 39.743502,
        long: -104.980749
    },
    {
        restaurant: 'Gozo',
        neighborhood: 'South Broadway',
        lat: 39.715948,
        long: -104.9871319
    },
    {
        restaurant: 'Vesper Lounge',
        neighborhood: 'Central Denver',
        lat: 39.727443,
        long: -104.983996
    },
    {
        restaurant: 'Leña',
        neighborhood: 'South Broadway',
        lat: 39.7171992,
        long: -104.9873205
    }
];

