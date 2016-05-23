
angular.module("sgpp").controller("headerController", function($scope, $location){
    $scope.navegarPara = function(destino){
        $location.path("/"+destino);
    }
});
