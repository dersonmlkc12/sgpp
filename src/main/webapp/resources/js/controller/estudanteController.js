app.controller('controlleEstudante', function ($scope, $http) {
    //Url base da aplicação
    $scope.url = 'http://localhost:8080/SGPP/rest/estudante/';

    $scope.novo = function () {
        $scope.est = {};
    };
    
    //Insere um novo registro
    $scope.salvar = function () {
        var dataObj = {
            nome: $scope.est.nome,
            data: $scope.est.data,
            sexo: $scope.est.sexo,
            rg: $scope.est.rg,
            rgOrgaoEmissor: $scope.est.rgOrgaoEmissor,
            rgUF: $scope.est.rgUF,
            rgDataEmissao: $scope.est.rgDataEmissao,
            matricula: $scope.est.matricula,
            nacionalidade: $scope.est.nacionalidade,
            pais: $scope.est.pais,
            passaporte: $scope.est.passaporte,
            visto: $scope.est.visto,
            periodoVigencia: $scope.est.periodoVigencia,
            endereco: $scope.est.endereco,
            enderecoCEP: $scope.est.enderecoCEP,
            enderecoCidade: $scope.est.enderecoCidade,
            enderecoUF: $scope.est.enderecoUF,
            telefone: $scope.est.telefone,
            celular: $scope.est.celular,
            email: $scope.est.email,
            curriculoLattesLink_: $scope.est.curriculoLattesLink_,
            curriculoLattesDtAtualizacao: $scope.est.curriculoLattesDtAtualizacao
        };
        var res = $http.post($scope.url, dataObj);
        res.success(function (data) {
            $scope.message = data;
            location.reload();
//            window.location.href("http://localhost:8080/SGPP/#/cadastro-rh");
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
        $http.delete($scope.url + 'delete/' + id).success(function (response) {
            location.reload();
        })
    };

    //Edição
    $scope.editar = function (id) {
        $http.get($scope.url + id).success(function (response) {
            $scope.est = response;
        })
    };
    
    //atualiza
    $scope.atualizar = function () {
        var dataObjA = {
            id: $scope.est.id,
            nome: $scope.est.nome,
            data: $scope.est.data,
            sexo: $scope.est.sexo,
            rg: $scope.est.rg,
            rgOrgaoEmissor: $scope.est.rgOrgaoEmissor,
            rgUF: $scope.est.rgUF,
            rgDataEmissao: $scope.est.rgDataEmissao,
            matricula: $scope.est.matricula,
            nacionalidade: $scope.est.nacionalidade,
            pais: $scope.est.pais,
            passaporte: $scope.est.passaporte,
            visto: $scope.est.visto,
            periodoVigencia: $scope.est.periodoVigencia,
            endereco: $scope.est.endereco,
            enderecoCEP: $scope.est.enderecoCEP,
            enderecoCidade: $scope.est.enderecoCidade,
            enderecoUF: $scope.est.enderecoUF,
            telefone: $scope.est.telefone,
            celular: $scope.est.celular,
            email: $scope.est.email,
            curriculoLattesLink_: $scope.est.curriculoLattesLink_,
            curriculoLattesDtAtualizacao: $scope.est.curriculoLattesDtAtualizacao};
        $http.put($scope.url + 'atualiza', dataObjA).success(function (response) {
            location.reload();
        })
    };

})


            