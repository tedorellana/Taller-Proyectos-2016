<%@include file="head.jspf" %>

<script src="../../js/sessionController.js" type="text/javascript"></script>
</head>
<!INICIO iniciarSession.jsp>
    <body>
        <!NAVBAR >
        <%@include file="navBar.jsp"%>
    
    
        
        <div ng-app="myApp" ng-controller="loginController">
            <div class="col-md-10 col-md-offset-1">
                <h1>INICIO DE SESION</h1>
            <form action="/"  id="myLogin">
                <div class="form-group">
                    <label>Nombre de Usuario:</label>
                    <input type="text" class="form-control" ng-model="nombreUsuario" placeholder="Nombre de Usuario">
                </div>
                <div class="form-group">
                    <label>Constraseña:</label>
                    <input type="password" class="form-control" ng-model="contrasenaUsuario" placeholder="Contraseña">
                </div>
                <br>
                <button class="btn btn-success" type="button" ng-click="loggin()">Inciar Sesion</button>
                <button class="btn btn-success" type="button" ng-click="Get()">get Sesion</button>
            </form>
            </div>
        </div>
    </body>
</html>

