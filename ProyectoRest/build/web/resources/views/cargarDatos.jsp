<%@include file="head.jspf" %>
<script src="../../js/principalController.js" type="text/javascript"></script>
</head>
<!INICIO cargarDatos.jsp>
<body>
    <div ng-app="myApp" ng-controller="myCtrl">
        <form>
            <p/>
            <div class="col-md-10 col-md-offset-1">
                <div class="form-group col-md-8 col-md-offset-2">
                    <label>Archivo XML:</label>
                    <input class="text"/>
                    <button type="button" class="btn btn-success" >
                        Cargar Archivo
                        <span class="glyphicon glyphicon-upload" aria-hidden="true">
                        </span>
                    </button>
                </div>
                <div class="col-md-12 form-group">
                    <div>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="t">
                                    <th class="col-md-1 warning"></th>
                                    <th class="col-md-1 warning"></th>
                                    <th class="text-center col-md-4 warning">Representación en la BD</th>
                                    <th class="col-md-1 warning"></th>
                                    <th class="col-md-1 danger">Selección</th>
                                    <th class="text-center col-md-3 info">Archivos XMl</th>
                                    <th class="col-md-1 info"></th>
                                </tr>
                                <tr>
                                    <th class="text-center col-md-1 warning">N°</th>
                                    <th class="text-center col-md-1 warning">Tabla Origen</th>
                                    <th class="text-center col-md-4 warning">Campo</th>
                                    <th class="text-center col-md-1 warning">Tipo</th>
                                    <th class="text-center col-md-1 danger">Selección</th>
                                    <th class="text-center col-md-3 info">Nombre</th>
                                    <th class="text-center col-md-1 info">Estado</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>tipo</td>
                                    <td>Tabla</td>
                                    <td><input ng-model="cambiado"/></td>
                                    <td class="danger"><input ng-model="selectedItem.nombre"></td>
                                    <td>
                                        <select class="form-control text-center" ng-options="persona.nombre for persona in PersonaList" ng-model="selectedItem" ng-change="cambioEnTag(selectedItem)">
                                        </select>
                                    </td>
                                    <td>Error</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <button ng-click="getSession()">GetSession</button>
            <button class="btn btn-info">Ver Modelo De Datos</button>
        </form>        
    </div>
</body>
</html>

