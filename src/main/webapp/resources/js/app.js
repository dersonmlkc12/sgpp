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
        .controller('estudanteControlle', function ($scope, $http) {
            $http.get('http://localhost:8080/SGPP/rest/estudante').success(function (response) {
                $scope.listEstudantes = response;
            });

        })
        .controller('myCtrl', function ($scope, $http) {
            $scope.estudantes = [{
                    "id": "3",
                    "nome": "hjghj",
                    "data": "hjghj",
                    "sexo": "hjghj",
                    "rg": "gjhgjh",
                    "rgOrgaoEmissor": "jgghj",
                    "rgUF": "ghjghj",
                    "rgDataEmissao": "gjhg",
                    "matricula": "jhjgj",
                    "nacionalidade": "jhgjhg",
                    "pais": "gjhhj",
                    "passaporte": "jhgh",
                    "visto": "gjh",
                    "periodoVigencia": "jhgj",
                    "endereco": "hgfgf",
                    "enderecoCEP": "fghgf",
                    "enderecoCidade": "hghj",
                    "enderecoUF": "hjhg",
                    "telefone": "hjgh",
                    "celular": "554545",
                    "email": "hfhgf",
                    "curriculoLattesLink_": "45",
                    "curriculoLattesDtAtualizacao": "5"
                }];

            $scope.sendPost = function () {
                var data = $.param({
                    json: JSON.stringify({
                        nome: $scope.nome,
                        data: $scope.data,
                        sexo: $scope.sexo,
                        rg: $scope.rg,
                        rgOrgaoEmissor: $scope.rgOrgaoEmissor,
                        rgUF: $scope.rgUF,
                        rgDataEmissao: $scope.rgDataEmissao,
                        matricula: $scope.matricula,
                        nacionalidade: $scope.nacionalidade,
                        pais: $scope.pais,
                        passaporte: $scope.passaporte,
                        visto: $scope.visto,
                        periodoVigencia: $scope.periodoVigencia,
                        endereco: $scope.endereco,
                        enderecoCEP: $scope.enderecoCEP,
                        enderecoCidade: $scope.enderecoCidade,
                        enderecoUF: $scope.enderecoUF,
                        telefone: $scope.telefone,
                        celular: $scope.celular,
                        email: $scope.email,
                        curriculoLattesLink_: $scope.curriculoLattesLink_,
                        curriculoLattesDtAtualizacao: $scope.curriculoLattesDtAtualizacao
                    })
                });
                $http.post("http://localhost:8080/SGPP/rest/estudante", data).success(function (data, status) {
                    $scope.estudantes = data;
                })
            }
        });