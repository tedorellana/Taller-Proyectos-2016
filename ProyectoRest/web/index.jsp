<%@include file="resources/views/head.jspf" %>
<script src="js/principalController.js" type="text/javascript"></script>
    </head>
    <body>
    <!NAVBAR>        
    <%@include file="resources/views/navBar.jsp" %>
    <div ng-app="myApp" ng-controller="myCtrl">
        <div class="col-md-10 col-md-offset-1">
            <form name="formPersona">
                <div class="form-group">
                    <table class="table table-striped">
                        <tr class="text allign-center">
                            <th>Nombre</th>
                            <th>Apellido Paterno</th>
                            <th>Apellido Materno</th>
                            <th>Detalles</th>
                        </tr>
                        <tr ng-repeat="persona in PersonaList">
                            <td> {{persona.nombre}} </td>
                            <td> {{persona.apellidoPat}} </td>
                            <td> {{persona.apellidoMat}} </td>
                            <td><button class="btn btn-info" value="{{persona.idPersona}}" > Detalle </button></td>
                        </tr>
                    </table>
                </div>
            </form>
            <a href="http://localhost:8084/ProyectoRest/resources/views/cargarDatos.jsp">
                <button class="btn btn-success">Cargar Datos</button>
            </a>
        </div>
    </div>
    </body>
</html>




