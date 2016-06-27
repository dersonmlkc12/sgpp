angular.module("sgpp")

        .controller('controlleEstudante', function ($scope, $http) {
            $scope.url = 'http://localhost:8080/SGPP/rest/estudante';

            //Insere um novo registro
            $scope.salvar = function () {
                var dataObj = {
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
                };
                var res = $http.post($scope.url, dataObj);
                res.success(function (data) {
                    $scope.message = data;
                    alert('done');
//                    location.reload();
                });
                res.error(function (data) {
                    alert("failure message: " + JSON.stringify({data: data}));
                });

            };

            //Lista todos os registros
            $http.get($scope.url).success(function (response) {
                $scope.listEstudantes = response;
            });

            //Deleta um registro pelo id
            $scope.deletar = function (id) {
                var result = confirm('quer deletar realmente?');
                if (result == true) {
                    $http.delete($scope.url + '/delete/' + id).success(function (response) {
                        location.reload();
                    })
                }
            };


            $scope.editar = function (estudante) {
                $scope.estu = estudante;
            };

            $scope.atualizar = function () {
                $http.put($scope.url + '/atualiza', $scope.estu).success(function (response) {
                    alert('done');
                })
            };

        })


            