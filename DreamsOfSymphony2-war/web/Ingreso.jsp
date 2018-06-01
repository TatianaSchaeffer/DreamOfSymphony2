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
        <div align="center">
            <h2>INGRESO PRODUCTO</h2> <br>
            <div class="form-group col-md-6">
                <label for="NombreP">Nombre producto: </label>
                <input type="text" class="form-control" id="NombreP" >
            </div>
            <div class="form-group col-md-6">
                <label for="CodigoP">Codigo: </label>
                <input type="text" class="form-control" id="CodigoP" >
            </div>
            <div class="form-group col-md-6">
                <label for="DescripcionP">Descripcion : </label>
                <textarea type="text" class="form-control" id="DescripcionP"></textarea>
            </div>
            <div class="form-group col-md-6">
                <label for="ImagenP">Adjuntar imagen</label><br>
                <input type="file" id="ImagenP">
            </div>
            <button type="submit" class="btn btn-primary" formaction="">Añadir Producto</button>
                
        </div>
            
            
        
        
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
       
    </body>
</html>
