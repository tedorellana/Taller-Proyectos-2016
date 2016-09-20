var app = angular.module('myApp', ['ngStorage']);
app.controller('myCtrl', function($scope, $http, $localStorage) {
    $scope.cambiado ="";
    $scope.cambioEnTag = function(nombre){
      $scope.cambiado = "funciona";
     alert('Template Url is : '+nombre);
    };
    $http.get("http://localhost:8084/ProyectoRest/webresources/rest/getPersonaList")
    .then(function(response){
       $scope.PersonaList = response.data;
    });
    $scope.getSession = function(){
        alert($localStorage.nombreUsuario);
    };
});

