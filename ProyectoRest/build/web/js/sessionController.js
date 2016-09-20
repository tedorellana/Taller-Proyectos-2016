var app = angular.module('myApp', ['ngStorage']);

app.controller('loginController', function($scope,$sessionStorage,$http){
    $scope.loggin = function(){
      var nombreUsuario = $scope.nombreUsuario;
      var contrasenaUsuario = $scope.constrasenaUsuario;
          $sessionStorage.nombreUsuario = nombreUsuario;
          $http({
            method: 'POST',
            url: 'http://localhost:8084/ProyectoRest/webresources/rest/savePersona',
            data: { nombre: nombreUsuario }
          }).then(function successCallback(response) {
              alert("funciona");
            }, function errorCallback(response) {
              alert("no funciona ERROOR");
            });
    };
    $scope.Get = function () {
      alert($sessionStorage.nombreUsuario);
    };
    
    
});

