<%-- 
    Document   : Ingreso
    Created on : 20-may-2018, 18:22:32
    Author     : tatia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/dream.css" type="text/css">
        <title>JSP Page</title>
    </head>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <body>
        <h1></h1>
        <h2>INGRESO PRODUCTO</h2> <br>
       
       <div>
         <div align-items: flex-start>
           <div class="form-row"> 
             <div class="form-group col-md-6">
                <label for="inputCodigo">Codigo Producto</label>
                <input type="text" class="form-control" id="CodigoP" >
             </div>
             <div class="form-group col-md-6">
                <label for="Cliente">Cliente</label>
                <input type="text" class="form-control" id="Cliente" >
             </div>    
           </div>
                 
           <div class="form-group">
               <label for="Direccion">Direccion</label>
               <input type="text" class="form-control" id="Direccion">
           </div>
                 
           <div class="form-group">
               <label for="Telefono">Telefono</label>
               <input type="text" class="form-control" id="Telefono">
           </div>
    
             <div class="form-group col-md-4">
                <label for="inputState">Metodo De Pago</label>
                 <select id="inputState" class="form-control">
                    <option selected>.....</option>
                    <option>Transferencia</option>
                    <option>Cheque</option>
                    <option>Efectivo</option>
                    <option>Debito</option>
                   <option>Credito</option>
                 </select>
                
             </div>  
           <div class="modal fade" id="AgregarPro" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
    <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
    <h4 class="modal-title" id="myModalLabel">Buscar productos</h4>
    </div>
    <div class="modal-body">
    <form class="form-horizontal">
    <div class="form-group">                                              
    <div class="col-sm-6">
    <input type="text" class="form-control" id="filtrar" placeholder="Buscar productos">
    </div>
    <a href="#" id="bus"><i class='glyphicon glyphicon-search'></i> Buscar</a>
                  </div>
                </form>                 
                                  <div class="outer_div">                                          
                                     
                                        <div class="table-responsive">
                                        <table class="table">
                                            <tbody class="buscar">    
                                        <tr  class="warning">
                                            <th>Código</th>
                                            <th>Producto</th>
                                            <th>Marca</th>  
                                            <th><span class="pull-right">Cant.</span></th>
                                            <th><span class="pull-right">Precio</span></th>
                                            <th class='text-center' style="width: 36px;">Agregar</th>
                                        </tr>
                                            </tbody>
                                        </table>
                                        </div>
                                  </div>
              </div>
             
            </div>
          </div>
        </div>
          </div>
       
        <button type="submit" class="btn btn-primary" formaction="">Añadir Producto</button>
        <button type="submit" class="btn btn-primary">Nuevo Cliente</button>
        
         <div class="container">
     <table class="table table-condensed">
       <thead>
          <tr>
             <th>Codigo</th>
             <th>Cantidad</th>
             <th>Descripcion</th>
             <th>Precio UNIT.</th>
             <th>Precio Total</th>
         </tr>
     </thead>
  </table>
</div>
        
       </div>
      </form>
               <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
       
    </body>
</html>
