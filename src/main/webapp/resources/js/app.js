angular.module("sgpp", ["ngMessages", "ngRoute", 'ngAnimate', 'angular-jwt', 'angular-loading-bar']);
angular.module("sgpp").config(["$routeProvider", "$httpProvider",
    function ($routeProvider, $httpProvider) {
        $routeProvider
        .when("/cadastro-rh", {
            templateUrl: "resources/view/cadastro-rh.html"
        }).when("/cadastro-proj", {
            templateUrl: "resources/view/cadastro-projeto.html"
        }).when("/index", {
            templateUrl: "resources/view/home.html"
        })
    }
])
