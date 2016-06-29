var app = angular.module("sgpp", ["ngMessages", "ngRoute", 'ngAnimate', 'angular-jwt', 'angular-loading-bar']);
        app.config(["$routeProvider", "$httpProvider",
            function ($routeProvider, $httpProvider) {
                $routeProvider
                .when("/cadastro-rh", {
                    templateUrl: "resources/view/cadastro-estudante.html"
                }).when("/cadastro-proj", {
                    templateUrl: "resources/view/cadastro-projeto.html"
                }).when("/index", {
                    templateUrl: "resources/view/home.html"
                }).when("/cadastro-pesq", {
                    templateUrl: "resources/view/cadastro-pesquisador.html"
                })
            }
        ])