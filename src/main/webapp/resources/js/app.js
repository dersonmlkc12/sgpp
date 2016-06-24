angular.module("sgpp", ["ngMessages", "ngRoute", 'ngAnimate', 'angular-jwt', 'angular-loading-bar'])
        .config(["$routeProvider", "$httpProvider",
            
            
            
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
                    }).when("/cadastro-volu", {
                        templateUrl: "resources/view/cadastro-voluntario.html"
                    })
            }

        ])
        .controller('CharactersCtrl', CharactersCtrl);

function CharactersCtrl($scope) {
    $scope.characters = [
        {name: 'John Snow', role: 'Bastard', gender: 'Male'},
        {name: 'Daenerys Targaryen', role: 'Mother of Dragons', gender: 'Female'},
        {name: 'Tyrion Lannister', role: 'Imp', gender: 'Male'},
        {name: 'Eddard Stark', role: 'Lord of Winterfell', gender: 'Male'},
        {name: 'Robert Baratheon', role: 'King', gender: 'Male'}
    ];
}

