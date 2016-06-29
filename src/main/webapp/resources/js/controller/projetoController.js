        app.controller('controlleProjeto', function ($scope, $http ) {
            //Url base da aplicação
            $scope.url = 'http://localhost:8080/SGPP/rest/projeto/';

            //Insere um novo registro
            $scope.salvar = function () {            
                var dataObj = {
                    titulo: $scope.titulo,
                    dataInicio: $scope.dataInicio,
                    descricao: $scope.descricao,
                    status: $scope.status
                };
                alert($scope.titulo);
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
                $scope.listProjetos = response;
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
                })
            };

            $scope.atualizar = function () {
                $http.put($scope.url + 'atualiza', $scope.estu).success(function (response) {
                    alert('done');
                })
            };

        })


            