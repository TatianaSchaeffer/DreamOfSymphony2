<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
  <div class="row">
    <div class="col-md-8">
      
        <%--Tabla carro de Compras--%>
        
        <div>
            <center> <h2>Tu Carro de Compras</h2></center></div>
            <table class="table" border="1">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">Imagen del Producto</th>
                        <th scope="col">Nombre del Producto</th>
                        <th scope="col">Precio</th>
                        <th scope="col">Cant.</th>
                        <th scope="col">Subtotal</th>
                        
                    </tr>
                </thead>
                     <tbody>
                     <tr>
                        <th scope="row"><img class="d-block w-50" src="img/Destacado3.png"></th>
                        <th scope="row"> Máquina de Humo Carver Pro 500W FML500/3-10</th>
                        <th scope="col-md" >$159.000   </th>
                        <th scope="col-md" > <input type="text" size="2" placeholder="1"></th>
                        <th scope="col-md" >$159.000   </th>
                     </tr>
    
                </tbody>
            </table>
         </div>
         </div>
    <div class="col-md-4">
        
      <%--Cupon de Compras--%>
      
        <div class="card border-dark mb-3" style="max-width: 50rem;" >
         <div class="card-body" >
             <center><h5 class="card-title">Codigos de Descuento</h5></center>
             <center><p class="card-text">Ingrese un codigo de Cupón, si tiene.</p></center>
             <center> <p><input type="text" size="30"></p></center>
             <center> <a href="#" class="btn btn-info btn-lg">
                         <span class="glyphicon glyphicon-ok-sign"></span> Aplicar Cupón
                             </a></center>
        </div>
        </div>
    </div>
    <div class="col-md-4">
        
        <%--Pagar--%>
        
        <div class="card border-dark mb-3" style="max-width: 50rem;">
         <div class="card-body">
             <center><h5 class="card-title">Subtotal : $159.000</h5></center>
             <center> <h5 class="card-title">Suma Total : $159.000</h5></center>
                        <center><p class="card-text">Revise antes de aplicar el boton comprar.</p></center>
                         <center> <a href="#" class="btn btn-info btn-lg">
                         <span class="glyphicon glyphicon-shopping-cart"></span> Comprar
                             </a></center>
                        
        </div>
        </div>
        
       
    </div>
     </div>

    
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  </body>
</html>
