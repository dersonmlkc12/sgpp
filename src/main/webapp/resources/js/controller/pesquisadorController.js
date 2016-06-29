        app.controller('controllePesquisador', function ($scope, $http ) {
            //Url base da aplicação
            $scope.url = 'http://localhost:8080/SGPP/rest/pesquisador/';

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
                    location.reload();
                    window.location.href("http://localhost:8080/SGPP/#/cadastro-proj");
                });
                res.error(function (data) {
                    alert("failure message: " + JSON.stringify({data: data}));
                });
            };

            //Lista todos os registros
            $http.get($scope.url).success(function (response) {
                $scope.listPesquisadores = response;
            });

            //Deleta um registro pelo id
            $scope.deletar = function (id) {
                var result = confirm('Deseja realmente excluir ?');
                if (result == true) {
                    
                    $http.delete($scope.url + 'delete/' + id).success(function (response) {
                        location.reload();
                    })
                }
            };

            //Edição
            $scope.editar = function (id) {
                $http.get($scope.url + id).success(function (response) {
                    $scope.list(response);
//                    alert($scope.listEstudantes({id:'3'}).nome+'passo')
//                    alert($scope.listEstudante.id+' '+$scope.listEstudante.nome);
                    
                })
            };
//            
//            $scope.editar = function (obj) {           
//                  $scope.listEstudante = obj;
//                  alert($scope.listEstudante.nome);
//                $scope.editarNome = obj.nome;
//                $scope.editarEmail = obj.email;
//                alert($scope.editarNome);
////               $location.path("/cadastro-rh-editar");
//               window.open("http://localhost:8080/SGPP/#/cadastro-rh-editar");
//            };

            $scope.atualizar = function () {
                $http.put($scope.url + 'atualiza', $scope.estu).success(function (response) {
                    alert('done');
                })
            };

        })


            